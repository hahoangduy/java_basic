package Baitap36;

public class Archer extends Army{
    public Archer(String m_Code, double m_Attack, double m_Defend, String m_Equipment, int m_Strength) {
        super(m_Code, m_Attack, m_Defend, m_Equipment, m_Strength);
    }

    @Override
    public double hasEquipment(double m_Equipment) {
        double newM_Attack = 0;
        if (getM_Equipment().equals("YES")) {
            newM_Attack = getM_Attack() * 1.5;
            return newM_Attack;
        }
        return getM_Attack();
    }

    @Override
    public void display() {
        double newM_Attack = 0;
        if (getM_Equipment().equals("YES")) {
            newM_Attack = getM_Attack() * 1.5;
            System.out.println("Code: " + getM_Code() + " |Attack: " + newM_Attack + " |Defend: " + getM_Defend() + " |Equipment: " + getM_Equipment() + " |Strength: " + getM_Strength());
        }
        else
            System.out.println("Code: " + getM_Code() + " |Attack: " + getM_Attack() + " |Defend: " + getM_Defend() + " |Equipment: " + getM_Equipment() + " |Strength: " + getM_Strength());
    }
}
