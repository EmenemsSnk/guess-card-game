package com.emenems.guesscardgame;

import com.emenems.guesscardgame.domain.Card;
import java.util.List;

public class Board {
    public static final int SMALL_BOARD_SIZE = 16;
    public static final int BASIC_BOARD_SIZE = 25;
    public static final int HUGE_BOARD_SIZE = 36;
    public int size;
    List<Card> cards;
}
