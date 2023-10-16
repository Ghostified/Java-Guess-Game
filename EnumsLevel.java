public enum EnumsLevel {

    HIGH (3),
    MEDIUM(2),
    LOW(1);

    private int lvlnum;

    private EnumsLevel(int num) {
        this.lvlnum = num;
    }
    
    public int getlvl() {
        return this.lvlnum;
    }

    public void setlvl( int num) {
         this.lvlnum = num;
    }
}
