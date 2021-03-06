package frdomain.ch6
package domain
package repository

import java.time.LocalDateTime

import cats._
import cats.data._
import cats.instances.all._

import common._

import model.account._

trait AccountRepository[M[_]] { 
  def query(no: AccountNo): M[Option[Account]]
  def store(a: Account): M[Account]
  def query(openedOn: LocalDateTime): M[List[Account]]
  def all: M[List[Account]]
  def balance(no: AccountNo): M[Option[Balance]]
}
