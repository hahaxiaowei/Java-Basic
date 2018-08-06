package cn.edu.hfut.proxy.dynamic;

/**
 * Created by SunWei
 * Date: 2018-08-06
 */
public class GamePlayer implements IGamePlayer {

    String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String name, String password) {
        System.out.printf("登陆名为" + name + "登陆密码为" + password+"\r\n"+"登陆成功");
    }

    public void killBoss() {
        System.out.printf(this.name+"击杀了Boss");
    }

    public void upGrade() {
        System.out.printf(this.name+"升级了!");
    }
}
