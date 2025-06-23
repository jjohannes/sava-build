plugins {
  id("org.gradlex.jvm-dependency-conflict-resolution")
}

jvmDependencyConflicts {
  consistentResolution {
    platform("software.sava:solana-version-catalog:${solanaBOMVersion()}")
  }
}
