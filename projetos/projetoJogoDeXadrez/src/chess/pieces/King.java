package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {




    //construtor
    public King(Board board, Color color) {
        super(board, color);
    }

    //Metodos
    @Override
    public String toString(){
        return "K";
    }
}
