plugins {
    java
    `maven-publish`
    val dgt = "1.1.0"
    id("xyz.deftu.gradle.tools") version(dgt)
    id("xyz.deftu.gradle.tools.loom") version(dgt)
    id("xyz.deftu.gradle.tools.blossom") version(dgt)
}

/*releases {
    modrinth {
        projectId.set("WfhjX9sQ")
        dependencies.set(listOf(
            ModDependency("P7dR8mSH", DependencyType.REQUIRED),
            ModDependency("Ha28R6CL", DependencyType.REQUIRED),
            ModDependency("mOgUt4GM", DependencyType.REQUIRED)
        ))
    }

    curseforge {
        projectId.set("695205")
        relations.set(listOf(
            CurseRelation("fabric-api", CurseRelationType.REQUIRED),
            CurseRelation("fabric-language-kotlin", CurseRelationType.REQUIRED),
            CurseRelation("modmenu", CurseRelationType.REQUIRED)
        ))
    }
}*/
