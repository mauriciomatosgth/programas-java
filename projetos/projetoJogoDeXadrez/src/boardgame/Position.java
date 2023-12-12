package boardgame;

public class Position {
    private int row;
    private int column;

    //Contrutores
    public Position(){

    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //Getter e Setter

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    //Metodos
    @Override
    public String toString(){
        return row + ", "+column;
    }
}
