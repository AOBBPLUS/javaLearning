package edu.interfacelearning;

public class Mage implements Skill {
    @Override
    public void useSkill() {
        System.out.println("发射火球！");
    }
    @Override
    public void showCoolDown(){
        System.out.println("冷却时间：5秒");
    }
}
