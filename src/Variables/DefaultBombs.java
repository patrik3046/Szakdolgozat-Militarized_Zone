package Variables;

import Elements.Bomb;

public class DefaultBombs {
    private static final Bomb[] bombs = new Bomb[]{
            new Bomb(new int[][] {
                    {0,0,1,0,0},
                    {0,0,1,0,0},
                    {1,1,1,1,1},
                    {0,0,1,0,0},
                    {0,0,1,0,0}
            },0.1),
            new Bomb(new int[][]{
                    {0,0,1,0,0},
                    {0,1,1,1,0},
                    {1,1,1,1,1},
                    {0,1,1,1,0},
                    {0,0,1,0,0}
            },0.1),
            new Bomb(new int[][]{
                    {0,1,1,1,0},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {0,1,1,1,0}
            },0.1),
            new Bomb(new int[][]{
                    {1,1,1,1,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,0,0,0,1},
                    {1,1,1,1,1}
            },0.1),
            new Bomb(new int[][]{
                    {1,0,0,0,1},
                    {0,1,0,1,0},
                    {0,0,1,0,0},
                    {0,1,0,1,0},
                    {1,0,0,0,1}
            },0.1),
            new Bomb(new int[][]{
                    {1,0,1},
                    {0,1,0},
                    {1,0,1}
            },0.2),
            new Bomb(new int[][]{
                    {1,1,1},
                    {1,1,1},
                    {1,1,1}
            },0.2),
            new Bomb(new int[][]{
                    {0,1,0},
                    {1,1,1},
                    {0,1,0}
            },0.2),
            new Bomb(new int[][]{
                    {1,1,1},
                    {1,0,1},
                    {1,1,1}
            },0.2)
    };

    public static Bomb[] getBombs() {
        return bombs;
    }
}
