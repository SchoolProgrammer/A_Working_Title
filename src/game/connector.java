/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

public class connector {
    
    int[][] b = new int [7][6];
    
    public connector() {
        
    }
    
    public boolean dropZero(boolean player) {
        if (b[0][5] == 0) {
            if (player) {
                b[0][5] = 1;
            } else {
                b[0][5] = -1;
            }
        } else if (b[0][4] == 0) {
            if (player) {
                b[0][4] = 1;
            } else {
                b[0][4] = -1;
            }
        } else if (b[0][3] == 0) {
            if (player) {
                b[0][3] = 1;
            } else {
                b[0][3] = -1;
            }
        } else if (b[0][2] == 0) {
            if (player) {
                b[0][2] = 1;
            } else {
                b[0][2] = -1;
            }
        } else if (b[0][1] == 0) {
            if (player) {
                b[0][1] = 1;
            } else {
                b[0][1] = -1;
            }
        } else if (b[0][0] == 0) {
            if (player) {
                b[0][0] = 1;
            } else {
                b[0][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropOne(boolean player) {
        if (b[1][5] == 0) {
            if (player) {
                b[1][5] = 1;
            } else {
                b[1][5] = -1;
            }
        } else if (b[1][4] == 0) {
            if (player) {
                b[1][4] = 1;
            } else {
                b[1][4] = -1;
            }
        } else if (b[1][3] == 0) {
            if (player) {
                b[1][3] = 1;
            } else {
                b[1][3] = -1;
            }
        } else if (b[1][2] == 0) {
            if (player) {
                b[1][2] = 1;
            } else {
                b[1][2] = -1;
            }
        } else if (b[1][1] == 0) {
            if (player) {
                b[1][1] = 1;
            } else {
                b[1][1] = -1;
            }
        } else if (b[1][0] == 0) {
            if (player) {
                b[1][0] = 1;
            } else {
                b[1][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropTwo(boolean player) {
        if (b[2][5] == 0) {
            if (player) {
                b[2][5] = 1;
            } else {
                b[2][5] = -1;
            }
        } else if (b[2][4] == 0) {
            if (player) {
                b[2][4] = 1;
            } else {
                b[2][4] = -1;
            }
        } else if (b[2][3] == 0) {
            if (player) {
                b[2][3] = 1;
            } else {
                b[2][3] = -1;
            }
        } else if (b[2][2] == 0) {
            if (player) {
                b[2][2] = 1;
            } else {
                b[2][2] = -1;
            }
        } else if (b[2][1] == 0) {
            if (player) {
                b[2][1] = 1;
            } else {
                b[2][1] = -1;
            }
        } else if (b[2][0] == 0) {
            if (player) {
                b[2][0] = 1;
            } else {
                b[2][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropThree(boolean player) {
        if (b[3][5] == 0) {
            if (player) {
                b[3][5] = 1;
            } else {
                b[3][5] = -1;
            }
        } else if (b[3][4] == 0) {
            if (player) {
                b[3][4] = 1;
            } else {
                b[3][4] = -1;
            }
        } else if (b[3][3] == 0) {
            if (player) {
                b[3][3] = 1;
            } else {
                b[3][3] = -1;
            }
        } else if (b[3][2] == 0) {
            if (player) {
                b[3][2] = 1;
            } else {
                b[3][2] = -1;
            }
        } else if (b[3][1] == 0) {
            if (player) {
                b[3][1] = 1;
            } else {
                b[3][1] = -1;
            }
        } else if (b[3][0] == 0) {
            if (player) {
                b[3][0] = 1;
            } else {
                b[3][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropFour(boolean player) {
        if (b[4][5] == 0) {
            if (player) {
                b[4][5] = 1;
            } else {
                b[4][5] = -1;
            }
        } else if (b[4][4] == 0) {
            if (player) {
                b[4][4] = 1;
            } else {
                b[4][4] = -1;
            }
        } else if (b[4][3] == 0) {
            if (player) {
                b[4][3] = 1;
            } else {
                b[4][3] = -1;
            }
        } else if (b[4][2] == 0) {
            if (player) {
                b[4][2] = 1;
            } else {
                b[4][2] = -1;
            }
        } else if (b[4][1] == 0) {
            if (player) {
                b[4][1] = 1;
            } else {
                b[4][1] = -1;
            }
        } else if (b[4][0] == 0) {
            if (player) {
                b[4][0] = 1;
            } else {
                b[4][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropFive(boolean player) {
        if (b[5][5] == 0) {
            if (player) {
                b[5][5] = 1;
            } else {
                b[5][5] = -1;
            }
        } else if (b[5][4] == 0) {
            if (player) {
                b[5][4] = 1;
            } else {
                b[5][4] = -1;
            }
        } else if (b[5][3] == 0) {
            if (player) {
                b[5][3] = 1;
            } else {
                b[5][3] = -1;
            }
        } else if (b[5][2] == 0) {
            if (player) {
                b[5][2] = 1;
            } else {
                b[5][2] = -1;
            }
        } else if (b[5][1] == 0) {
            if (player) {
                b[5][1] = 1;
            } else {
                b[5][1] = -1;
            }
        } else if (b[5][0] == 0) {
            if (player) {
                b[5][0] = 1;
            } else {
                b[5][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    public boolean dropSix(boolean player) {
        if (b[6][5] == 0) {
            if (player) {
                b[6][5] = 1;
            } else {
                b[6][5] = -1;
            }
        } else if (b[6][4] == 0) {
            if (player) {
                b[6][4] = 1;
            } else {
                b[6][4] = -1;
            }
        } else if (b[6][3] == 0) {
            if (player) {
                b[6][3] = 1;
            } else {
                b[6][3] = -1;
            }
        } else if (b[6][2] == 0) {
            if (player) {
                b[6][2] = 1;
            } else {
                b[6][2] = -1;
            }
        } else if (b[6][1] == 0) {
            if (player) {
                b[6][1] = 1;
            } else {
                b[6][1] = -1;
            }
        } else if (b[6][0] == 0) {
            if (player) {
                b[6][0] = 1;
            } else {
                b[6][0] = -1;
            }
        } else {
            return false;
        }
        return true;
    }
    
    public int fill(int width, int height) {
        return b[width][height];
    }
    public boolean check(int width, int height) {
        
        
        return false;
    }
}
