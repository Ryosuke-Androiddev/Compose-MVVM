package com.example.compose_mvvm.ui.db.model

import androidx.compose.ui.graphics.Color


sealed class Priority(val color: Color){
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}
