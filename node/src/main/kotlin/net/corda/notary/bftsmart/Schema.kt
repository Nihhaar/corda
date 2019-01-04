package net.corda.notary.bftsmart

import net.corda.core.schemas.MappedSchema
import net.corda.node.services.transactions.PersistentUniquenessProvider

object BFTSmartNotarySchema

object BFTSmartNotarySchemaV1 : MappedSchema(
        schemaFamily = BFTSmartNotarySchema.javaClass,
        version = 1,
        mappedTypes = listOf(
                PersistentUniquenessProvider.BaseComittedState::class.java,
                PersistentUniquenessProvider.Request::class.java,
                BFTSmartNotaryService.CommittedState::class.java
        )
) {
    override val migrationResource: String?
        get() = "notary-bft-smart.changelog-master"
}