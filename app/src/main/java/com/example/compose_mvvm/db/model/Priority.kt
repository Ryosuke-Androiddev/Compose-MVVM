package com.example.compose_mvvm.db.model

import androidx.compose.ui.graphics.Color
import com.example.compose_mvvm.ui.theme.HighPriorityColor
import com.example.compose_mvvm.ui.theme.LowPriorityColor
import com.example.compose_mvvm.ui.theme.MediumPriorityColor
import com.example.compose_mvvm.ui.theme.NonePriorityColor


enum class Priority(val color: Color){
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
