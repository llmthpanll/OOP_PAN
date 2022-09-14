package lab1;



public abstract class Player {
    private double HP;
    private double MP;
    private double EXP;
    private double Money;
    private double ATK;
    public double getHP(){
        return HP;
    }
    public void setHP(double HP){
        this.HP += HP;
        if(this.HP<0){
            this.HP = 0;
        }
    }
    public double getMP(){
        return MP;
    }
    public void setMP(double MP){
        this.MP += MP;
    }
    public double getEXP(){
        return EXP;
    }
    public void setEXP(double EXP){
        this.EXP += EXP;
    }
    public double getMoney(){
        return Money;
    }
    public void setMoney(double Money){
        this.Money += Money;
    }
    public double getATK(){
        return ATK;
    }
    public void setATK(double ATK){
        this.ATK += ATK;
    }
    public String toString(){
        return "HP : "+HP+" MP : "+MP+"  ATK : "+ATK;
    }
    public abstract void attack(Player p);
    public abstract void attacked(double n);
}