package com.example.myapplication

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.first_fragment , container , false)
        
        view.findViewById<ComposeView>(R.id.compose_view).setContent { 
            Text(text = "from composable", color = MaterialTheme.colors.surface)
        }
        
        return view
     /*   return ComposeView(requireContext()).apply {
            setContent { 
                Text(text = "Hi from compose", color = MaterialTheme.colors.surface)
            } 
        }*/
    }
}