package com.company;

public class BOSS extends GameEntity {
    Weapon weapon  = new Weapon();  //сложного типа данных

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println(getHealth() + "\n " +
                getDamage() + "\n" + weapon.getWeaponType() + "\n" + weapon.getWeaponName());

    }
}
