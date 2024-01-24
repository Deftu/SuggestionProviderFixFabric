plugins {
    java
    `maven-publish`
    var dgt = "1.22.2"
    id("dev.deftu.gradle.tools") version dgt
    id("dev.deftu.gradle.tools.resources") version dgt
    id("dev.deftu.gradle.tools.blossom") version dgt
    id("dev.deftu.gradle.tools.maven-publishing") version dgt
    id("dev.deftu.gradle.tools.minecraft.loom") version dgt
    id("dev.deftu.gradle.tools.minecraft.api") version dgt
    id("dev.deftu.gradle.tools.minecraft.releases") version dgt
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
