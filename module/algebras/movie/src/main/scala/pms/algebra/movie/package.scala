package pms.algebra

import pms.core._
import java.time._

/**
  *
  * @author Lorand Szakacs, https://github.com/lorandszakacs
  * @since 25 Jun 2018
  *
  */
package object movie {
  object MovieID extends PhantomType[Long]
  type MovieID = MovieID.Type

  object MovieTitle extends PhantomType[String]
  type MovieTitle = MovieTitle.Type

  object ReleaseDate extends PhantomType[LocalDate]
  type ReleaseDate = ReleaseDate.Type

  type QueryInterval = (ReleaseDate, ReleaseDate)
}
