package game;

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
    //Add up to 7
    public int fill(int width, int height) {
        return b[width][height];
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