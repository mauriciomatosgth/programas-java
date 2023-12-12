package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {



    //contrutor
    public Rook(Board board, Color color) {
        super(board, color);
    }



    //metodos
    @Override
    public String toString(){
        return "R";
    }
}
