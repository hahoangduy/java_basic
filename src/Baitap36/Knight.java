package Baitap36;

public class Knight extends Army{

    public Knight(String m_Code, double m_Attack, double m_Defend, String m_Equipment, int m_Strength) {
    super(m_Code, m_Attack, m_Defend, m_Equipment, m_Strength);
}
    @Override
    public double hasEquipment(double m_Equipment) {
        double newM_Attack = 0;
        double newM_Defend = 0;
        if (getM_Equipment().equals("YES")) {
            newM_Attack = getM_Attack() * 3;
            newM_Defend = getM_Defend() * 3;
            return newM_Attack + newM_Defend;
        }
        return getM_Attack() + getM_Defend();
    }

    @Override
    public void display() {
        double newM_Attack = 0;
        double newM_Defend = 0;
        if (getM_Equipment().equals("YES")) {
            newM_Attack = getM_Attack() * 3;
            newM_Defend = getM_Defend() * 3;
            System.out.println("Code: " + getM_Code() + " |Attack: " + newM_Attack + " |Defend: " + newM_Defend + " |Equipment: " + getM_Equipment() + " |Strength: " + getM_Strength());
        }
        else
            System.out.println("Code: " + getM_Code() + " |Attack: " + getM_Attack() + " |Defend: " + getM_Defend() + " |Equipment: " + getM_Equipment() + " |Strength: " + getM_Strength());
    }
}
