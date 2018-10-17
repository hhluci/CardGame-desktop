package cn.edu.bnu.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import cn.edu.bnu.game.MainGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();	

        final float pixWidth = 1366;				// ���ڿ�Ȳο�ֵ
        final float ratio = 1366.0F / 768.0F;	// ���ڿ�߱ȣ��ʵ����ڿ�߱ȿ��Բ鿴�ڲ�ͬ��Ļ�ϵ�Ч����
        final float scale = 1.0F;	
        config.title="��������Ƭ��ϷVer1.0";
        config.width = (int) (pixWidth * scale);         	// ���ڿ��
        config.height = (int) ((pixWidth / ratio) * scale);	// ���ڸ߶�        
        config.resizable = false;				// ��������Ϊ��С���ɸı�     
        config.allowSoftwareMode = true;
        config.backgroundFPS = -1;
      
        new LwjglApplication(new MainGame(), config);
    }
}
