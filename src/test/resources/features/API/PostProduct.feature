@postProduct
Feature: Post Product
  As User
  I want to run api to Post product
  So that i can Post data master product

  @TestCase001
  Scenario Outline: 01 - Success Post Product
    Given on master post product Endpoint
    When hit end post product with "<method>" and body title: "<title>" price: "<price>" description: "<description>" image: "<image>" category: "<category>"
    Then success post product list
    Examples:
      |method|title|price|description|image|category|
      |post|blablaba|100|blasblas|https://i.pravatar.cc|barang|

  @TestCase002
  Scenario Outline: 02 - Failed post Product with wrong method
    Given on master post product Endpoint
    When hit end post product with "<method>" and body title: "<title>" price: "<price>" description: "<description>" image: "<image>" category: "<category>"
    Then failed post product list
    Examples:
      |method|title|price|description|image|category|
      |put|blablaba|100|blasblas|https://i.pravatar.cc|barang|
      |patch|blablaba|100|blasblas|https://i.pravatar.cc|barang|
      |delete|blablaba|100|blasblas|https://i.pravatar.cc|barang|