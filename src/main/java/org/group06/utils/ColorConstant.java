package org.group06.utils;

import java.awt.*;
import java.util.ArrayList;

public class ColorConstant {
    // Màu chữ
    public static final Color TEXT_HEADER_FOOTER = new Color(0, 0, 0);
    public static final Color TEXT_NORMAL = new Color(0, 0, 0);
    public static final Color TEXT_PLACEHOLDER = new Color(153, 153, 153);
    public static final Color TEXT_BUTTON = new Color(255, 255, 255);

    // Màu nền
    public static final Color BACKGROUND_NORMAL = new Color(214, 228, 229);
    public static final Color BACKGROUND_BLACK = new Color(30, 30, 30);
    public static final Color BACKGROUND_GRAY = Color.GRAY;
    public static final Color BACKGROUND_HEADER_FOOTER = new Color(73, 113, 116);
    public static final Color BACKGROUND_WHITE = new Color(255, 255, 255);
    public static final Color BACKGROUND_SIDEBAR = new Color(17, 57, 70);
    public static final Color BACKGROUND_CONTAINER = new Color(188, 163, 127);

    // Màu nút
    public static final Color BUTTON_ACTIVE = new Color(234, 215, 187);
    public static final Color BUTTON_HOVER = new Color(255, 242, 216);
    public static final Color BUTTON_LOGIN_NORMAL = new Color(17, 57, 70);
    public static final Color BUTTON_LOGIN_HOVER = new Color(6,79,102);
    public static final Color BUTTON_LOGIN_CLICK = new Color(3,107,139);
    public static final Color BUTTON_SECONDARY_NORMAL = new Color(200, 200, 200);
    public static final Color BUTTON_SECONDARY_HOVER = new Color(150, 150, 150);
    public static final Color BUTTON_SECONDARY_CLICK = new Color(100, 100, 100);

    //
    public static final Color TITLE_BORDER = new Color(102, 102, 102);

    private ColorConstant() {
        // Để ngăn việc tạo đối tượng instance của lớp này
    }

    public static ArrayList<Color> generateColorPalette(int numberOfColors) {
        ArrayList<Color> colorPalette = new ArrayList<>();
        float hueStep = 1.0f / numberOfColors;
        for (int i = 0; i < numberOfColors; i++) {
            colorPalette.add(Color.getHSBColor(i * hueStep, 1.0f, 1.0f));
        }
        return colorPalette;
    }
}

