#!/usr/bin/env groovy

ruleset {
  ruleset('rulesets/basic.xml')
  ruleset('rulesets/braces.xml')
  ruleset('rulesets/concurrency.xml')
  ruleset('rulesets/convention.xml') {
    TrailingComma(enabled: false)
  }
  ruleset('rulesets/design.xml') {
    NestedForLoop(enabled: false)
  }
  ruleset('rulesets/dry.xml') {
    DuplicateListLiteral(enabled: false)
    DuplicateMapLiteral(enabled: false)
    DuplicateStringLiteral(enabled: false)
  }
  ruleset('rulesets/exceptions.xml')
  ruleset('rulesets/formatting.xml') {
    Indentation(spacesPerIndentLevel: 2)
    LineLength(enabled: false)
    SpaceAroundMapEntryColon(enabled: false)
    SpaceAfterClosingBrace(enabled: false)
  }
  ruleset('rulesets/generic.xml')
  ruleset('rulesets/grails.xml')
  ruleset('rulesets/groovyism.xml')
  ruleset('rulesets/imports.xml')
  ruleset('rulesets/jdbc.xml')
  ruleset('rulesets/junit.xml')
  ruleset('rulesets/logging.xml')
  ruleset('rulesets/naming.xml')
  ruleset('rulesets/security.xml')
  ruleset('rulesets/serialization.xml')
  ruleset('rulesets/unnecessary.xml')
  ruleset('rulesets/unused.xml')
}
