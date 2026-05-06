package Baitap36;

import PizzaStoreProject.GreekPizza;

public class ArmyGeneral extends Army{
    private double m_Experience;
    public ArmyGeneral(String m_Code, double m_Attack, double m_Defend, String m_Equipment, int m_Strength, double m_Experience) {
        super(m_Code, m_Attack, m_Defend, m_Equipment, m_Strength);
        this.m_Experience = m_Experience;
    }
    @Override
    public double hasEquipment(double m_Equipment) {
        return 0;
    }

    public void Experience(double m_Experience) {
        if (m_Experience == 0) {
            double buff = (getM_Attack() * 0.5) + (getM_Defend() * 0.5);
        }
        if (m_Experience < 0 && m_Experience <= 2) {
            double buff1 = (getM_Attack() * 1.2) + (getM_Defend() * 1.2);
        }
        if (m_Experience < 2 && m_Experience <= 5) {
            double buff1 = (getM_Attack() * 1.5) + (getM_Defend() * 1.5);
        }
        if (m_Experience > 5) {
            double buff1 = (getM_Attack() * 2) + (getM_Defend() * 2);
        }
    }

    @Override
    public void display() {
        System.out.println("Code: " + getM_Code() + " |Attack: " + getM_Attack() + " |Defend: " + getM_Defend() + " |Equipment: " + getM_Equipment() + " |Strength: " + getM_Strength() + " |Experience: " + m_Experience);
    }
}
