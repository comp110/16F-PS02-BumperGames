package comp110;

import comp110.engine.BumperGame;
import comp110.engine.GameEngine;
import comp110.pieces.Ship;
import javafx.scene.paint.Color;

import comp110.events.KeyboardEvent;
import comp110.events.CollisionEvent;

/**
 * Author:
 *
 * ONYEN:
 *
 * Collaborator ONYEN(s):
 *
 * UNC Honor Pledge: I certify that no unauthorized assistance has been received
 * or given in the completion of this work. I certify that I understand and
 * could now rewrite on my own, without assistance from collaborators or course
 * staff, the problem set code I am submitting.
 */
public class Sumo implements BumperGame {

  /*
   * First we're declaring instance variables for keeping score.
   * 
   * Notice we can declare two variables of the same type in a single line by
   * separating them with a comma:
   */
  private double _homeScore, _awayScore;

  /*
   * Next we're declaring an instance variable to hold a reference to the game
   * engine. We'll need this to stop the game once there is a winner.
   */
  private GameEngine _gameEngine;

  /*
   * Finally, here we're declaring two Ship instance variables.
   */
  private Ship _homeShip, _awayShip;

  /*
   * Constructor: initialize our instance variables
   */
  public Sumo() {
    _homeScore = 0.0;
    _awayScore = 0.0;

    // TODO: 1.1 Initialize ships.
  }

  /* Methods */

  public void setup(GameEngine gameEngine) {
    _gameEngine = gameEngine;

    // TODO: 1.2 Add pieces to the game engine.
  }

  public double getHomeScore() {
    return _homeScore;
  }

  public double getAwayScore() {
    return _awayScore;
  }

  public Color getHomeColor() {
    return Color.CORNFLOWERBLUE;
  }

  public Color getAwayColor() {
    return Color.DARKSEAGREEN;
  }

  public Ship getHomeShip() {
    return _homeShip;
  }

  public Ship getAwayShip() {
    return _awayShip;
  }

  /*
   * TODO: Implement KeyboardHandler and CollisionHandler interfaces.
   */

}