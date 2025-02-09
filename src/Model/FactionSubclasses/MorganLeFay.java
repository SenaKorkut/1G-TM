package Model.FactionSubclasses;

import Controller.ActionController;
import Model.Faction;

public class MorganLeFay extends Faction { //witch
  
  public MorganLeFay() {
   setInitials();
  }
  public void setInitials() {
      TERRAIN_TILE = "Forest";
      INITIAL_CHRISTIANITY = 2; //air
      DWELLING_GOLD_COST = 2;
      DWELLING_WORKER_COST = 1;
      DWELLING_WORKER_INCOME = 1;
      spadeNeededToTerraformPlains = 0;
      spadeNeededToTerraformSwamp = 0;
      spadeNeededToTerraformLakes = 0;
      spadeNeededToTerraformForest = 0;
      spadeNeededToTerraformMountains = 0;
      spadeNeededToTerraformWasteland = 0;
      spadeNeededToTerraformDesert = 0;
      getAdditionalVictoryPointsAfterTown = 5;
  }

    public void afterStronghold() {

    }
}
