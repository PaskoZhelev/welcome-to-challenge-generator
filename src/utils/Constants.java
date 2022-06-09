package utils;

import model.Figure;

public class Constants {
    public static final String FIGURE_UNICODES = "[size=20]🌴🔶🌊📮🏦♐[/size]";

    public static final String GREEN_FIGURE = "\uD83C\uDF34";
    public static final String BLUE_FIGURE = "\uD83C\uDF0A";
    public static final String GRAY_FIGURE = "\uD83C\uDFE6";
    public static final String ORANGE_FIGURE = "\uD83D\uDD36";
    public static final String RED_FIGURE = "\uD83D\uDCEE";
    public static final String PURPLE_FIGURE = "♐";

    public static final String CITY_PLAN_BLOCK = "\uD83D\uDD32";

    public static final String BLOCK_PREFIX = "[o][c]\n";
    public static final String BLOCK_SUFFIX = "[/c][/o]";

    public static final String CITY_PLAN_NAME = "[b][size=15]City Plan #%d[/size][/b]\n";
    public static final String CITY_PLAN_HIGHER = "[size=15]Higher Points: [b]%d[/b][/size]\n";
    public static final String CITY_PLAN_SIZE_PREFIX = "[b][size=15]";
    public static final String CITY_PLAN_SIZE_SUFFIX = "[/size][/b]\n";
    public static final String CITY_PLAN_LOWER = "[size=15]Lower Points: [b]%d[/b][/size]\n";
    public static final String CITY_SPACE_BETWEEN = "[size=15][microbadge=3][/size][b][size=15][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=15][/size][/b]\n";

    public static String getFigureForEnum(Figure fig) {
        switch (fig) {
            case GREEN:
                return GREEN_FIGURE;
            case BLUE:
                return BLUE_FIGURE;
            case GRAY:
                return GRAY_FIGURE;
            case ORANGE:
                return ORANGE_FIGURE;
            case RED:
                return RED_FIGURE;
            case PURPLE:
                return PURPLE_FIGURE;
            default:
                return GREEN_FIGURE;
        }
    }
    public static final String SOLO_CARD = "[o][c]\n" +
            "[b][size=15]\uD83C\uDCCF[/size][/b]\n" +
            "[b][size=15]Solo Card![/size][/b]\n" +
            "[size=12]Turn over the Plan cards that are not yet \"approved\" to their \"approved\" side.[/size]\n" +
            "[size=15][microbadge=3][/size][b][size=15][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=15][/size][/b]\n" +
            "[/c][/o]";

    public static final String THREE_CARDS = "[o][c]\n" +
            "[b][size=15]%d [%s][/size][/b]\n" +
            "[b][size=15]%d [%s][/size][/b]\n" +
            "[b][size=15]%d [%s][/size][/b]\n" +
            "[size=15][microbadge=3][/size][b][size=15][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=15][/size][/b]\n" +
            "[/c][/o]";

    public static final String SAMPLE_CITY_PLANS =
            "[o][c]\n" +
            "[b][size=20]City Plan #1[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[size=20]Higher Points: [b]8[/b][/size]\n" +
            "[size=20]Lower Points:  [b]6[/b][/size]\n" +
            "[size=20][microbadge=3][/size][b][size=18][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=18][/size][/b]\n" +
            "[b][size=20]City Plan #2[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[size=20]Higher Points: [b]8[/b][/size]\n" +
            "[size=20]Lower Points:  [b]6[/b][/size]\n" +
            "[size=20][microbadge=3][/size][b][size=18][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=18][/size][/b]\n" +
            "[b][size=20]City Plan #3[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[b][size=20]6 \uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32\uD83D\uDD32[/size][/b]\n" +
            "[size=20]Higher Points: [b]8[/b][/size]\n" +
            "[size=20]Lower Points:  [b]6[/b][/size]\n" +
            "[size=20][microbadge=3][/size][b][size=18][color=#a5a351][/color][/size][/b]\n" +
            "__________________________________________________________________________________________________________________________\n" +
            "[b][size=18][/size][/b]\n" +
            "[/c][/o]";

}
