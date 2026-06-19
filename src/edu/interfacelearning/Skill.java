package edu.interfacelearning;

public interface Skill {
    void useSkill();
    default void showCoolDown(){
        System.out.println("冷却时间：3秒");
    }
}
