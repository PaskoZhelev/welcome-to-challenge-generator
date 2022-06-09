import model.CityPlanCard;
import model.ConstructionCard;
import model.Figure;
import utils.Constants;

import java.util.*;

public class WelcomeToGame {
    private static int NUM_TURNS = 27;

    private StringBuilder sb;

    public WelcomeToGame() {
        sb = new StringBuilder();
    }
    public void generateChallenge() {
        // city plan generation
        generateCityPlans();

        // construction cards generation
        final List<ConstructionCard> allConstructionCards = initConstructionDeck();
        Collections.shuffle(allConstructionCards);

        final List<ConstructionCard> firstSubDeck = new ArrayList<>();
        final List<ConstructionCard> secondSubDeck = new ArrayList<>();

        for (int i = 0; i < 41; i++)
        {
            firstSubDeck.add(allConstructionCards.get(i));
        }

        for (int i = 41; i < 81; i++)
        {
            secondSubDeck.add(allConstructionCards.get(i));
        }

        secondSubDeck.add(ConstructionCard.create(0, Figure.SOLO_CARD));
        Collections.shuffle(secondSubDeck);

        final Queue<ConstructionCard> finalDeck = new LinkedList<>(firstSubDeck);
        finalDeck.addAll(secondSubDeck);

        for (int i = 0; i < NUM_TURNS; i++) {
            ConstructionCard firstCard = getTopCard(finalDeck);
            ConstructionCard secondCard = getTopCard(finalDeck);
            ConstructionCard thirdCard = getTopCard(finalDeck);

            sb.append(String.format(
                    Constants.THREE_CARDS,
                    firstCard.number,
                    Constants.getFigureForEnum(firstCard.figure),
                    secondCard.number,
                    Constants.getFigureForEnum(secondCard.figure),
                    thirdCard.number,
                    Constants.getFigureForEnum(thirdCard.figure)));
        }

        System.out.println(sb.toString());
    }

    private void generateCityPlans() {
        final List<CityPlanCard> cityPlanLevel1Cards = initCityPlanLevel1();
        final List<CityPlanCard> cityPlanLevel2Cards = initCityPlanLevel2();
        final List<CityPlanCard> cityPlanLevel3Cards = initCityPlanLevel3();
        final List<CityPlanCard> cards = Arrays.asList(cityPlanLevel1Cards.get(0), cityPlanLevel2Cards.get(0),cityPlanLevel3Cards.get(0));

        sb.append(Constants.BLOCK_PREFIX);
        for (int i = 0; i < cards.size(); i++) {
            sb.append(String.format(Constants.CITY_PLAN_NAME, i + 1));
            final CityPlanCard currCard = cards.get(i);

            for (Integer num :
                    currCard.estateSizes) {
                sb.append(Constants.CITY_PLAN_SIZE_PREFIX);
                sb.append(num).append(" ");

                for (int j = 0; j < num; j++) {
                    sb.append(Constants.CITY_PLAN_BLOCK);
                }
                sb.append(Constants.CITY_PLAN_SIZE_SUFFIX);
            }

            sb.append(String.format(Constants.CITY_PLAN_HIGHER, currCard.higherPoints));
            sb.append(String.format(Constants.CITY_PLAN_LOWER, currCard.lowerPoints));
            sb.append(Constants.CITY_SPACE_BETWEEN);
        }
        sb.append(Constants.BLOCK_SUFFIX);
    }

    private ConstructionCard getTopCard(Queue<ConstructionCard> finalDeck) {
        ConstructionCard topCard = finalDeck.poll();

        if(topCard.figure == Figure.SOLO_CARD) {
            sb.append(Constants.SOLO_CARD);
            topCard  = finalDeck.poll();
        }

        return topCard;
    }

    private List<ConstructionCard> initConstructionDeck() {
        return Arrays.asList(
                    ConstructionCard.create(1, Figure.GREEN),
                    ConstructionCard.create(2, Figure.GREEN),
                    ConstructionCard.create(4, Figure.GREEN),
                    ConstructionCard.create(5, Figure.GREEN),
                    ConstructionCard.create(5, Figure.GREEN),
                    ConstructionCard.create(6, Figure.GREEN),
                    ConstructionCard.create(7, Figure.GREEN),
                    ConstructionCard.create(7, Figure.GREEN),
                    ConstructionCard.create(8, Figure.GREEN),
                    ConstructionCard.create(8, Figure.GREEN),
                    ConstructionCard.create(9, Figure.GREEN),
                    ConstructionCard.create(9, Figure.GREEN),
                    ConstructionCard.create(10, Figure.GREEN),
                    ConstructionCard.create(11, Figure.GREEN),
                    ConstructionCard.create(11, Figure.GREEN),
                    ConstructionCard.create(12, Figure.GREEN),
                    ConstructionCard.create(14, Figure.GREEN),
                    ConstructionCard.create(15, Figure.GREEN),

                    ConstructionCard.create(1, Figure.GRAY),
                    ConstructionCard.create(2, Figure.GRAY),
                    ConstructionCard.create(3, Figure.GRAY),
                    ConstructionCard.create(5, Figure.GRAY),
                    ConstructionCard.create(5, Figure.GRAY),
                    ConstructionCard.create(6, Figure.GRAY),
                    ConstructionCard.create(6, Figure.GRAY),
                    ConstructionCard.create(7, Figure.GRAY),
                    ConstructionCard.create(8, Figure.GRAY),
                    ConstructionCard.create(8, Figure.GRAY),
                    ConstructionCard.create(9, Figure.GRAY),
                    ConstructionCard.create(10, Figure.GRAY),
                    ConstructionCard.create(10, Figure.GRAY),
                    ConstructionCard.create(11, Figure.GRAY),
                    ConstructionCard.create(11, Figure.GRAY),
                    ConstructionCard.create(13, Figure.GRAY),
                    ConstructionCard.create(14, Figure.GRAY),
                    ConstructionCard.create(15, Figure.GRAY),

                    ConstructionCard.create(3, Figure.BLUE),
                    ConstructionCard.create(4, Figure.BLUE),
                    ConstructionCard.create(6, Figure.BLUE),
                    ConstructionCard.create(7, Figure.BLUE),
                    ConstructionCard.create(8, Figure.BLUE),
                    ConstructionCard.create(9, Figure.BLUE),
                    ConstructionCard.create(10, Figure.BLUE),
                    ConstructionCard.create(12, Figure.BLUE),
                    ConstructionCard.create(13, Figure.BLUE),

                    ConstructionCard.create(1, Figure.PURPLE),
                    ConstructionCard.create(2, Figure.PURPLE),
                    ConstructionCard.create(4, Figure.PURPLE),
                    ConstructionCard.create(5, Figure.PURPLE),
                    ConstructionCard.create(5, Figure.PURPLE),
                    ConstructionCard.create(6, Figure.PURPLE),
                    ConstructionCard.create(7, Figure.PURPLE),
                    ConstructionCard.create(7, Figure.PURPLE),
                    ConstructionCard.create(8, Figure.PURPLE),
                    ConstructionCard.create(8, Figure.PURPLE),
                    ConstructionCard.create(9, Figure.PURPLE),
                    ConstructionCard.create(9, Figure.PURPLE),
                    ConstructionCard.create(10, Figure.PURPLE),
                    ConstructionCard.create(11, Figure.PURPLE),
                    ConstructionCard.create(11, Figure.PURPLE),
                    ConstructionCard.create(12, Figure.PURPLE),
                    ConstructionCard.create(14, Figure.PURPLE),
                    ConstructionCard.create(15, Figure.PURPLE),

                    ConstructionCard.create(3, Figure.ORANGE),
                    ConstructionCard.create(4, Figure.ORANGE),
                    ConstructionCard.create(6, Figure.ORANGE),
                    ConstructionCard.create(7, Figure.ORANGE),
                    ConstructionCard.create(8, Figure.ORANGE),
                    ConstructionCard.create(9, Figure.ORANGE),
                    ConstructionCard.create(10, Figure.ORANGE),
                    ConstructionCard.create(12, Figure.ORANGE),
                    ConstructionCard.create(13, Figure.ORANGE),

                    ConstructionCard.create(3, Figure.RED),
                    ConstructionCard.create(4, Figure.RED),
                    ConstructionCard.create(6, Figure.RED),
                    ConstructionCard.create(7, Figure.RED),
                    ConstructionCard.create(8, Figure.RED),
                    ConstructionCard.create(9, Figure.RED),
                    ConstructionCard.create(10, Figure.RED),
                    ConstructionCard.create(12, Figure.RED),
                    ConstructionCard.create(13, Figure.RED)
                );
    }

    private List<CityPlanCard> initCityPlanLevel1() {
        List<CityPlanCard> deck = Arrays.asList(
                CityPlanCard.create(List.of(1,1,1,1,1,1), 8, 4, 1),
                CityPlanCard.create(List.of(2,2,2,2), 8, 4, 1),
                CityPlanCard.create(List.of(3,3,3), 8, 4, 1),
                CityPlanCard.create(List.of(4,4), 6, 3, 1),
                CityPlanCard.create(List.of(5,5), 8, 4, 1),
                CityPlanCard.create(List.of(6,6), 10, 6, 1)
        );
        Collections.shuffle(deck);
        return deck;
    }

    private List<CityPlanCard> initCityPlanLevel2() {
        List<CityPlanCard> deck = Arrays.asList(
                CityPlanCard.create(List.of(1,1,1,6), 11, 6, 2),
                CityPlanCard.create(List.of(3,6), 8, 4, 2),
                CityPlanCard.create(List.of(5,2,2), 10, 6, 2),
                CityPlanCard.create(List.of(3,3,4), 12, 7, 2),
                CityPlanCard.create(List.of(4,5), 9, 5, 2),
                CityPlanCard.create(List.of(4,1,1,1), 9, 5, 2)
        );

        Collections.shuffle(deck);
        return deck;
    }

    private List<CityPlanCard> initCityPlanLevel3() {
        List<CityPlanCard> deck = Arrays.asList(
                CityPlanCard.create(List.of(1,2,6), 12, 7, 3),
                CityPlanCard.create(List.of(1,4,5), 13, 7, 3),
                CityPlanCard.create(List.of(3,4), 7, 3, 3),
                CityPlanCard.create(List.of(2,5), 7, 3, 3),
                CityPlanCard.create(List.of(1,2,2,3), 11, 6, 3),
                CityPlanCard.create(List.of(2,3,5), 13, 7, 3)
        );

        Collections.shuffle(deck);
        return deck;
    }
}
