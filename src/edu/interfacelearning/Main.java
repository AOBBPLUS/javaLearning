package edu.interfacelearning;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        warrior.useSkill();
        warrior.showCoolDown();
        mage.useSkill();
        mage.showCoolDown();
        showInfo(warrior);
        showInfo(mage);
    }
    public static void showInfo(Skill skill) {
        skill.useSkill();
        skill.showCoolDown();
    }
}
