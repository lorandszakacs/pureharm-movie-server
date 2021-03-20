package pms.service.user

import pms._
import pms.kernel._
import pms.algebra.user._

/** @author Lorand Szakacs, https://github.com/lorandszakacs
  * @since 26 Jun 2018
  */
final case class PasswordResetRequest(
  email: Email
)

final case class PasswordResetCompletion(
  token:  PasswordResetToken,
  newPws: PlainTextPassword,
)
