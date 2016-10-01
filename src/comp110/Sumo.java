package comp110;

import comp110.engine.BumperGame;
import comp110.engine.GameEngine;
import comp110.events.KeyboardEvent;
import comp110.events.CollisionEvent;
import comp110.pieces.Ship;

import javafx.scene.paint.Color;

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
   * First we're declaring two Ship instance variables.
   */
  private Ship _homeShip, _awayShip;

  /*
   * We're declaring an instance variable to hold a reference to the game
   * engine. We'll need this to stop the game once there is a winner.
   */
  private GameEngine _gameEngine;

  /*
   * Constructor: initialize our instance variables
   */
  public Sumo() {
    // TODO: 1.1 Initialize ships.
  }

  /* Methods */

  public void setup(GameEngine gameEngine) {
    _gameEngine = gameEngine;

    // TODO: 1.2 Add pieces to the game engine.
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