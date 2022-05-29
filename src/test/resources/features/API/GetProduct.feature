@getProduct
Feature: Get Product
  As User
  I want to run api to get product
  So that i can get data master product

  @TestCase001
  Scenario: 01 - Success Get Product
    Given on master get product Endpoint
    When request get product list
    Then success get product list

  @TestCase002
  Scenario Outline: 02 - Failed Get Product with wrong method
    Given on master get product Endpoint
    When request "<method>" product list
    Then failed product list
    Examples:
    |method|
    |put|
    |patch|
    |delete|