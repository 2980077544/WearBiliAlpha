package cn.spacexc.wearbili.dataclass.video.rcmd.app

data class FeedbackPanelDetail(
    val icon_url: String,
    val jump_type: Int,
    val jump_url: String,
    val module_id: Long,
    val secondary_panel: List<SecondaryPanel>?,
    val sub_text: String,
    val text: String
)