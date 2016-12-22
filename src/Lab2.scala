// На языке Scala написать функции headOption и tailOption для списка с
// побочными и без побочных эффектов (headOption(List()) = None)

object Lab2 {

  /**
    * @param l list
    * @tparam A
    * @return head of the list
    */
  def headOption[A](l: List[A]): Option[A] = {
    l.foldRight(None: Option[A])((h, _) => Some(h))
  }

  def headOption2[A](l: List[A]): Option[A] = {
    if (l.isEmpty) sys.error("list is empty")
    else l.foldRight(None: Option[A])((h, _) => Some(h))
  }

  /**
    *
    * @param l list
    * @tparam A
    * @return tail of the list
    */
  def tailOption[A](l: List[A]): Option[List[A]] = {
    l match {
      case head :: tail => Some(tail)
      case _ => None
    }
  }

  /**
    *
    * @param l list
    * @tparam A
    * @return tail of the list
    */
  def tailOption2[A](l: List[A]): Option[List[A]] = {
    l match {
      case head :: tail => Some(tail)
      case _ => sys.error("list is empty")
    }
  }

}
