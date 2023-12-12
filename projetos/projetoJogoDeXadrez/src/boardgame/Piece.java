package boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;

    //Contrutores
    public Piece(){

    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Getter e setter
    protected Board getBoard() {
        return board;
    }

    //metodos

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

}
