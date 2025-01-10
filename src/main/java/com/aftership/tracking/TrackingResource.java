/*
 * This code was auto generated by AfterShip SDK Generator.
 * Do not edit the class manually.
 */
package com.aftership.tracking;

import com.aftership.base.Resource;

public class TrackingResource extends Resource {
  public static GetTrackingByIdFetcher getTrackingById() {
    return new GetTrackingByIdFetcher();
  }

  public static UpdateTrackingByIdUpdater updateTrackingById() {
    return new UpdateTrackingByIdUpdater();
  }

  public static MarkTrackingCompletedByIdCreator markTrackingCompletedById() {
    return new MarkTrackingCompletedByIdCreator();
  }

  public static GetTrackingsReader getTrackings() {
    return new GetTrackingsReader();
  }

  public static CreateTrackingCreator createTracking() {
    return new CreateTrackingCreator();
  }

  public static DeleteTrackingByIdDeleter deleteTrackingById() {
    return new DeleteTrackingByIdDeleter();
  }

  public static RetrackTrackingByIdCreator retrackTrackingById() {
    return new RetrackTrackingByIdCreator();
  }
}
