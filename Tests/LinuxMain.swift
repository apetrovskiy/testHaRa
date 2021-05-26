import XCTest

import testHaRaTests

var tests = [XCTestCaseEntry]()
tests += testHaRaTests.allTests()
XCTMain(tests)
