package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;


    //Construtor


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    //Getter e Setter

    public Color getColor() {
        return color;
    }


}
