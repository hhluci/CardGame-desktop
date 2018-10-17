package cn.edu.bnu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import cn.edu.bnu.game.MainGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();	

        final float pixWidth = 1366;				// 窗口宽度参考值
        final float ratio = 1366.0F / 768.0F;	// 窗口宽高比（适当调节宽高比可以查看在不同屏幕上的效果）
        final float scale = 1.0F;	
        config.title="创造力卡片游戏Ver1.0";
        config.width = (int) (pixWidth * scale);         	// 窗口宽度
        config.height = (int) ((pixWidth / ratio) * scale);	// 窗口高度        
        config.resizable = false;				// 窗口设置为大小不可改变     
        config.allowSoftwareMode = true;
        config.backgroundFPS = -1;
      
        new LwjglApplication(new MainGame(), config);
    }
}
