package cn.spacexc.wearbili.dataclass.video.rcmd.app

data class Args(
    val aid: Long,
    val rid: Long,
    val rname: String,
    val tid: Long?,
    val tname: String?,
    val up_id: Long,
    val up_name: String?
)