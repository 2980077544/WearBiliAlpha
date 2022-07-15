package cn.spacexc.wearbili.dataclass.dynamic.dynamictext.card

data class Item(
    val content: String,
    val ctrl: String,
    val orig_dy_id: Int,
    val pre_dy_id: Int,
    val reply: Int,
    val rp_id: Long,
    val timestamp: Int,
    val uid: Int
)