package game;

import java.awt.Color;

public class connector {
    
    int[][] b = new int [7][6];
    
    public connector() {
        for(int x = 0; x < 7; x ++) {
            for(int y = 0; y < 6; y ++) {
                b[x][y] = 0;
            }
        }
    }
    
    public int dropZero(boolean player) {
        if (b[0][5] == 0) {
            if (player) {
                b[0][5] = 1;
                if (check(0, 5)) {
                    return 1;
                }
            } else {
                b[0][5] = -1;
                if (check(0, 5)) {
                    return 2;
                }
            }
        } else if (b[0][4] == 0) {
            if (player) {
                b[0][4] = 1;
                if (check(0, 4)) {
                    return 1;
                }
            } else {
                b[0][4] = -1;
                if (check(0, 4)) {
                    return 2;
                }
            }
        } else if (b[0][3] == 0) {
            if (player) {
                b[0][3] = 1;
                if (check(0, 3)) {
                    return 1;
                }
            } else {
                b[0][3] = -1;
                if (check(0, 3)) {
                    return 2;
                }
            }
        } else if (b[0][2] == 0) {
            if (player) {
                b[0][2] = 1;
                if (check(0, 2)) {
                    return 1;
                }
            } else {
                b[0][2] = -1;
                if (check(0, 2)) {
                    return 2;
                }
            }
        } else if (b[0][1] == 0) {
            if (player) {
                b[0][1] = 1;
                if (check(0, 1)) {
                    return 1;
                }
            } else {
                b[0][1] = -1;
                if (check(0, 1)) {
                    return 2;
                }
            }
        } else if (b[0][0] == 0) {
            if (player) {
                b[0][0] = 1;
                if (check(0, 0)) {
                    return 1;
                }
            } else {
                b[0][0] = -1;
                if (check(0, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropOne(boolean player) {
        if (b[1][5] == 0) {
            if (player) {
                b[1][5] = 1;
                if (check(1, 5)) {
                    return 1;
                }
            } else {
                b[1][5] = -1;
                if (check(1, 5)) {
                    return 2;
                }
            }
        } else if (b[1][4] == 0) {
            if (player) {
                b[1][4] = 1;
                if (check(1, 4)) {
                    return 1;
                }
            } else {
                b[1][4] = -1;
                if (check(1, 4)) {
                    return 2;
                }
            }
        } else if (b[1][3] == 0) {
            if (player) {
                b[1][3] = 1;
                if (check(1, 3)) {
                    return 1;
                }
            } else {
                b[1][3] = -1;
                if (check(1, 3)) {
                    return 2;
                }
            }
        } else if (b[1][2] == 0) {
            if (player) {
                b[1][2] = 1;
                if (check(1, 2)) {
                    return 1;
                }
            } else {
                b[1][2] = -1;
                if (check(1, 2)) {
                    return 2;
                }
            }
        } else if (b[1][1] == 0) {
            if (player) {
                b[1][1] = 1;
                if (check(1, 1)) {
                    return 1;
                }
            } else {
                b[1][1] = -1;
                if (check(1, 1)) {
                    return 2;
                }
            }
        } else if (b[1][0] == 0) {
            if (player) {
                b[1][0] = 1;
                if (check(1, 0)) {
                    return 1;
                }
            } else {
                b[1][0] = -1;
                if (check(1, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropTwo(boolean player) {
        if (b[2][5] == 0) {
            if (player) {
                b[2][5] = 1;
                if (check(2, 5)) {
                    return 1;
                }
            } else {
                b[2][5] = -1;
                if (check(2, 5)) {
                    return 2;
                }
            }
        } else if (b[2][4] == 0) {
            if (player) {
                b[2][4] = 1;
                if (check(2, 4)) {
                    return 1;
                }
            } else {
                b[2][4] = -1;
                if (check(2, 4)) {
                    return 2;
                }
            }
        } else if (b[2][3] == 0) {
            if (player) {
                b[2][3] = 1;
                if (check(2, 3)) {
                    return 1;
                }
            } else {
                b[2][3] = -1;
                if (check(2, 3)) {
                    return 2;
                }
            }
        } else if (b[2][2] == 0) {
            if (player) {
                b[2][2] = 1;
                if (check(2, 2)) {
                    return 1;
                }
            } else {
                b[2][2] = -1;
                if (check(2, 2)) {
                    return 2;
                }
            }
        } else if (b[2][1] == 0) {
            if (player) {
                b[2][1] = 1;
                if (check(2, 1)) {
                    return 1;
                }
            } else {
                b[2][1] = -1;
                if (check(2, 1)) {
                    return 2;
                }
            }
        } else if (b[2][0] == 0) {
            if (player) {
                b[2][0] = 1;
                if (check(2, 0)) {
                    return 1;
                }
            } else {
                b[2][0] = -1;
                if (check(2, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropThree(boolean player) {
        if (b[3][5] == 0) {
            if (player) {
                b[3][5] = 1;
                if (check(3, 5)) {
                    return 1;
                }
            } else {
                b[3][5] = -1;
                if (check(3, 5)) {
                    return 2;
                }
            }
        } else if (b[3][4] == 0) {
            if (player) {
                b[3][4] = 1;
                if (check(3, 4)) {
                    return 1;
                }
            } else {
                b[3][4] = -1;
                if (check(3, 4)) {
                    return 2;
                }
            }
        } else if (b[3][3] == 0) {
            if (player) {
                b[3][3] = 1;
                if (check(3, 3)) {
                    return 1;
                }
            } else {
                b[3][3] = -1;
                if (check(3, 3)) {
                    return 2;
                }
            }
        } else if (b[3][2] == 0) {
            if (player) {
                b[3][2] = 1;
                if (check(3, 2)) {
                    return 1;
                }
            } else {
                b[3][2] = -1;
                if (check(3, 2)) {
                    return 2;
                }
            }
        } else if (b[3][1] == 0) {
            if (player) {
                b[3][1] = 1;
                if (check(3, 1)) {
                    return 1;
                }
            } else {
                b[3][1] = -1;
                if (check(3, 1)) {
                    return 2;
                }
            }
        } else if (b[3][0] == 0) {
            if (player) {
                b[3][0] = 1;
                if (check(3, 0)) {
                    return 1;
                }
            } else {
                b[3][0] = -1;
                if (check(3, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropFour(boolean player) {
        if (b[4][5] == 0) {
            if (player) {
                b[4][5] = 1;
                if (check(4, 5)) {
                    return 1;
                }
            } else {
                b[4][5] = -1;
                if (check(4, 5)) {
                    return 2;
                }
            }
        } else if (b[4][4] == 0) {
            if (player) {
                b[4][4] = 1;
                if (check(4, 4)) {
                    return 1;
                }
            } else {
                b[4][4] = -1;
                if (check(4, 4)) {
                    return 2;
                }
            }
        } else if (b[4][3] == 0) {
            if (player) {
                b[4][3] = 1;
                if (check(4, 3)) {
                    return 1;
                }
            } else {
                b[4][3] = -1;
                if (check(4, 3)) {
                    return 2;
                }
            }
        } else if (b[4][2] == 0) {
            if (player) {
                b[4][2] = 1;
                if (check(4, 2)) {
                    return 1;
                }
            } else {
                b[4][2] = -1;
                if (check(4, 2)) {
                    return 2;
                }
            }
        } else if (b[4][1] == 0) {
            if (player) {
                b[4][1] = 1;
                if (check(4, 1)) {
                    return 1;
                }
            } else {
                b[4][1] = -1;
                if (check(4, 1)) {
                    return 2;
                }
            }
        } else if (b[4][0] == 0) {
            if (player) {
                b[4][0] = 1;
                if (check(4, 0)) {
                    return 1;
                }
            } else {
                b[4][0] = -1;
                if (check(4, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropFive(boolean player) {
        if (b[5][5] == 0) {
            if (player) {
                b[5][5] = 1;
                if (check(5, 5)) {
                    return 1;
                }
            } else {
                b[5][5] = -1;
                if (check(5, 5)) {
                    return 2;
                }
            }
        } else if (b[5][4] == 0) {
            if (player) {
                b[5][4] = 1;
                if (check(5, 4)) {
                    return 1;
                }
            } else {
                b[5][4] = -1;
                if (check(5, 4)) {
                    return 2;
                }
            }
        } else if (b[5][3] == 0) {
            if (player) {
                b[5][3] = 1;
                if (check(5, 3)) {
                    return 1;
                }
            } else {
                b[5][3] = -1;
                if (check(5, 3)) {
                    return 2;
                }
            }
        } else if (b[5][2] == 0) {
            if (player) {
                b[5][2] = 1;
                if (check(5, 2)) {
                    return 1;
                }
            } else {
                b[5][2] = -1;
                if (check(5, 2)) {
                    return 2;
                }
            }
        } else if (b[5][1] == 0) {
            if (player) {
                b[5][1] = 1;
                if (check(5, 1)) {
                    return 1;
                }
            } else {
                b[5][1] = -1;
                if (check(5, 1)) {
                    return 2;
                }
            }
        } else if (b[5][0] == 0) {
            if (player) {
                b[5][0] = 1;
                if (check(5, 0)) {
                    return 1;
                }
            } else {
                b[5][0] = -1;
                if (check(5, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public int dropSix(boolean player) {
        if (b[6][5] == 0) {
            if (player) {
                b[6][5] = 1;
                if (check(6, 5)) {
                    return 1;
                }
            } else {
                b[6][5] = -1;
                if (check(6, 5)) {
                    return 2;
                }
            }
        } else if (b[6][4] == 0) {
            if (player) {
                b[6][4] = 1;
                if (check(6, 4)) {
                    return 1;
                }
            } else {
                b[6][4] = -1;
                if (check(6, 4)) {
                    return 2;
                }
            }
        } else if (b[6][3] == 0) {
            if (player) {
                b[6][3] = 1;
                if (check(6, 3)) {
                    return 1;
                }
            } else {
                b[6][3] = -1;
                if (check(6, 3)) {
                    return 2;
                }
            }
        } else if (b[6][2] == 0) {
            if (player) {
                b[6][2] = 1;
                if (check(6, 2)) {
                    return 1;
                }
            } else {
                b[6][2] = -1;
                if (check(6, 2)) {
                    return 2;
                }
            }
        } else if (b[6][1] == 0) {
            if (player) {
                b[6][1] = 1;
                if (check(6, 1)) {
                    return 1;
                }
            } else {
                b[6][1] = -1;
                if (check(6, 1)) {
                    return 2;
                }
            }
        } else if (b[6][0] == 0) {
            if (player) {
                b[6][0] = 1;
                if (check(6, 0)) {
                    return 1;
                }
            } else {
                b[6][0] = -1;
                if (check(6, 0)) {
                    return 2;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }
    public Color fill(int width, int height) {
        if (b[width][height] == -1) {
            return Color.yellow;
        } else if (b[width][height] == 1) {
            return Color.red;
        }
    return Color.white;
    }
    public boolean check(int width, int height) {
        if (width < 4 && height > 2) {
            if (b[width][height] == b[width + 3][height - 3] && b[width][height] == b[width + 2][height - 2] && b[width][height] == b[width + 1][height - 1]) {
                return true;
            }
        }
        if (width < 5 && width > 0 && height > 1 && height < 5) {
            if (b[width][height] == b[width - 1][height + 1] && b[width][height] == b[width + 2][height - 2] && b[width][height] == b[width + 1][height - 1]) {
                return true;
            }
        }
        if (width < 4) {
            if (b[width][height] == b[width + 1][height] && b[width][height] == b[width + 2][height] && b[width][height] == b[width + 3][height] ) {
            return true;
            }
        }
        if (width < 5 && width > 0) {
            if (b[width][height] == b[width + 1][height] && b[width][height] == b[width + 2][height] && b[width][height] == b[width - 1][height] ) {
            return true;
            }
        }
        if (width < 4 && height < 3) {
            if (b[width][height] == b[width + 3][height + 3] && b[width][height] == b[width + 2][height + 2] && b[width][height] == b[width + 1][height + 1]) {
                return true;
            }
        }
        if (width < 5 && width > 0 && height > 0 && height < 4) {
            if (b[width][height] == b[width - 1][height - 1] && b[width][height] == b[width + 2][height + 2] && b[width][height] == b[width + 1][height + 1]) {
                return true;
            }
        }
        if (height < 3) {
            if (b[width][height] == b[width][height + 3] && b[width][height] == b[width][height + 2] && b[width][height] == b[width][height + 1]) {
                return true;
            }
        }
        if (width > 3 && height < 3) {
            if (b[width][height] == b[width - 3][height + 3] && b[width][height] == b[width - 2][height + 2] && b[width][height] == b[width - 1][height + 1]) {
                return true;
            }
        }
        if (width > 2 && width < 5 && height > 0 && height < 4) {
            if (b[width][height] == b[width + 1][height - 1] && b[width][height] == b[width - 2][height + 2] && b[width][height] == b[width - 1][height + 1]) {
                return true;
            }
        }
        if (width > 3) {
            if (b[width][height] == b[width - 3][height] && b[width][height] == b[width - 2][height] && b[width][height] == b[width - 1][height]) {
                return true;
            }
        }
        if (width > 2 && width < 5) {
            if (b[width][height] == b[width + 1][height] && b[width][height] == b[width - 2][height] && b[width][height] == b[width - 1][height]) {
                return true;
            }
        }
        if (width > 3 && height > 2) {
            if (b[width][height] == b[width - 3][height] && b[width][height] == b[width - 2][height] && b[width][height] == b[width - 1][height]) {
                return true;
            }
        }
        if (width > 2 && width < 5 && height > 1 && height < 5) {
            if (b[width][height] == b[width + 1][height] && b[width][height] == b[width - 2][height] && b[width][height] == b[width - 1][height]) {
                return true;
            }
        }
        return false;
    }
}