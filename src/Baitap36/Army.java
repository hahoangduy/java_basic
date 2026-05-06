package Baitap36;

public abstract class Army {
    private String m_Code;
    private double m_Attack;
    private double m_Defend;
    private String m_Equipment;
    private int m_Strength;

    public Army(String m_Code, double m_Attack, double m_Defend, String m_Equipment, int m_Strength) {
        this.m_Code = m_Code;
        this.m_Attack = m_Attack;
        this.m_Defend = m_Defend;
        this.m_Equipment = m_Equipment;
        this.m_Strength = m_Strength;
    }

    public String getM_Code() {
        return m_Code;
    }

    public double getM_Attack() {
        return m_Attack;
    }

    public double getM_Defend() {
        return m_Defend;
    }

    public String getM_Equipment() {
        return m_Equipment;
    }

    public int getM_Strength() {
        return m_Strength;
    }

    public void setM_Attack(double m_Attack) {
        this.m_Attack = m_Attack;
    }

    public void setM_Defend(double m_Defend) {
        this.m_Defend = m_Defend;
    }


    public abstract double hasEquipment(double m_Equipment);

    public abstract void display();
}
