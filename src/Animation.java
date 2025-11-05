/*public class Animation extends MyFrame2 {
    public static void main(String[] args) {
    	MyFrame2 frame1=new Animation();
		frame1.setSize(600,600);
    }

    //中心座標 (cx, cy) および半径 r の円を描画(色を整数 c = 0, 1, 他で指定)
    public void fillCircleWithCC(int cx, int cy, int r, int c) {
        // TODO
    	if(c%3==0) {
    		setColor(255, 0, 0);
    	}else if(c%3==1) {
    		setColor(0, 255, 0);
    	}else{
    		setColor(0, 0, 255);
    	}
    	fillOval(cx-r,cy-r,2*r,2*r);
    }

    public void run() {

        int r = 5;     // 移動する円の半径
        int c = 1;     // 移動する円の色(0 → 赤, 1 → 黄緑, 他 → 青)
        int ct = 0;		//向きを変えた回数を数えるための変数
        int n = 7;

        int bx = 50;   // 四角形の左端の x 座標
        int by = 100;  // 四角形の上端の y 座標
        int w = 300;   // 四角形の幅
        int h = 230;   // 四角形の高さ

        int x0 = bx + r;      // 移動する円の中心 x 座標の最小値
        int x1 = bx + w - r;  // 移動する円の中心 x 座標の最大値
        int y0 = by + r;		//移動する円の中心 y 座標の最小値
        int y1 = by + h - r;	//移動する円の中心 y 座標の最大値
        int x = bx + r + 5*n;      // 移動する円の中心 x 座標
        int y = by + r + 5*n;      // 移動する円の中心 y 座標

        int dx = 5;    // 単位時間あたりの x 座標の変化量
        int dy = 5;    // 単位時間あたりの y 座標の変化量

        int animeT = 300;   // アニメーションの総コマ数
        double wtime = 0.1; // sleep に与える待機時間(コマの切り替えの間隔)

        for (int t = 0; t <= animeT; t++) {
            clear();   

            setColor(225, 225, 225);
            fillRect(bx, by, w, h);  // 円が移動する範囲を示す四角形を描画

            fillCircleWithCC(x, y, r, c);  // 中心座標(x, y) および半径 r の円を描画(色の設定が変わるので注意)
            x += dx;  // x 座標の変化
            y += dy;  // y 座標の変化

            if (x >= x1 && y<=y0) {      
                if(dx==5&&dy==(-5)) {
                	 dx = -5;          
                     dy = -5;
                }
                else if(dx==5&&dy==5) {
                	 dx = -5;          
                     dy = 5;
                }
                c++;
            } 
            else if (x>=x1 && y>=y1){
            	if(dx==(-5)&&dy==5) {
               	 dx = -5;          
                 dy = -5;
               }
               else if(dx==5&&dy==5) {
               	 dx = 5;          
                 dy = -5;
               }
                c++;
            }
            else if (x <= x0 && y>=y1){ 
            	if(dx==(-5)&&dy==5) {
                  	dx = 5;          
                    dy = 5;
                  }
                  else if(dx==(-5)&&dy==(-5)) {
                  	dx = 5;          
                    dy = -5;
                  }
                c++;
            }
            else if (x <= x0 && y<=y0){ 
            	if(dx==(-5)&&dy==(-5)) {
                  	dx = -5;          
                    dy = 5;
                  }
                  else if(dx==5&&dy==(-5)) {
                  	dx = 5;          
                    dy = 5;
                  }
                c++;
            }
            

            sleep(wtime);
        }
    }
}*/

public class Animation extends MyFrame2 {
    public static void main(String[] args) {
    	MyFrame2 frame1=new Animation();
		frame1.setSize(500,500);
    }

    //中心座標 (cx, cy) および半径 r の円を描画(色を整数 c = 0, 1, 他で指定)
    public void fillCircleWithCC(int cx, int cy, int r, int c) {
        // TODO
    	if(c%3==0) {
    		setColor(255, 0, 0);
    	}else if(c%3==1) {
    		setColor(0, 255, 0);
    	}else{
    		setColor(0, 0, 255);
    	}
    	fillOval(cx-r,cy-r,2*r,2*r);
    }

    public void run() {

        int r = 5;     // 移動する円の半径
        int c = 1;     // 移動する円の色(0 → 赤, 1 → 黄緑, 他 → 青)

        int bx = 50;   // 四角形の左端の x 座標
        int by = 100;  // 四角形の上端の y 座標
        int w = 300;   // 四角形の幅
        int h = 230;   // 四角形の高さ

        int x0 = bx + r;      // 移動する円の中心 x 座標の最小値
        int x1 = bx + w - r;  // 移動する円の中心 x 座標の最大値
        int y0 = by + r;		//移動する円の中心 y 座標の最小値
        int y1 = by + h - r;	//移動する円の中心 y 座標の最大値
        int x = bx + r;      // 移動する円の中心 x 座標
        int y = by + r;      // 移動する円の中心 y 座標

        int dx = 5;    // 単位時間あたりの x 座標の変化量
        int dy = 0;    // 単位時間あたりの y 座標の変化量

        int animeT = 300;   // アニメーションの総コマ数
        double wtime = 0.1; // sleep に与える待機時間(コマの切り替えの間隔)

        for (int t = 0; t <= animeT; t++) {
            clear();   

            setColor(225, 225, 225);
            fillRect(bx, by, w, h);  // 円が移動する範囲を示す四角形を描画

            fillCircleWithCC(x, y, r, c);  // 中心座標(x, y) および半径 r の円を描画(色の設定が変わるので注意)
            x += dx;  // x 座標の変化
            y += dy;  // y 座標の変化

            if (x >= x1) {       // 右の壁に到達
                dx = -5;
                c++;
            } 
            else if (y>=y1){ // 下の壁に到達
                dy = -5;
                c++;
            }
            else if (x <= x0){ // 左の壁に到達
                dx = 5;
                c++;
            }
            else if (y<=y0){ // 上の壁に到達
                dy = 5;
                c++;
            }
 
            sleep(wtime);
        }
    }
}


