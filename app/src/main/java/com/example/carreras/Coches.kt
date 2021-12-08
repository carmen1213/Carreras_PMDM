package com.example.carreras

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class Coches : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coches)

        val moreButton: ImageView = findViewById(R.id.more_actions_button)
        moreButton.setOnClickListener { view ->
            showMoreActionsMenu(view)
        }
        val moreButton1: ImageView = findViewById(R.id.more_actions_button2)
        moreButton1.setOnClickListener { view ->
            showMoreActionsMenu1(view)
        }
        val moreButton2: ImageView = findViewById(R.id.more_actions_button3)
        moreButton2.setOnClickListener { view ->
            showMoreActionsMenu2(view)
        }
        val moreButton3: ImageView = findViewById(R.id.more_actions_button4)
        moreButton3.setOnClickListener { view ->
            showMoreActionsMenu3(view)
        }
        val moreButton4: ImageView = findViewById(R.id.more_actions_button5)
        moreButton4.setOnClickListener { view ->
            showMoreActionsMenu4(view)
        }

        


        val list = mutableListOf<CarouselItem>()

        val carousel: ImageCarousel = findViewById(R.id.carousel)


        list.add(
            CarouselItem(
                imageUrl = "https://www.diariomotor.com/imagenes/2019/09/ferrari-f8-spider-ferrari-f8-tributo_03.jpg",

            )
        )

        list.add(
            CarouselItem(
                imageUrl = "https://www.ventos.site/wp-content/uploads/2021/08/2020-ferrari-f8-spyder-112-1593551723.jpg",

            )
        )
        val list1 = mutableListOf<CarouselItem>()

        val carousel1: ImageCarousel = findViewById(R.id.carousel1)
        list1.add(
            CarouselItem(
                imageUrl = "https://www.autonocion.com/wp-content/uploads/2020/11/Lamborghini-Hurac%C3%A1n-EVO-Fluo-Capsule-16.jpg",
            )
        )

        list1.add(
            CarouselItem(
                imageUrl = "https://www.wallpapertip.com/wmimgs/57-572962_lamborghini-huracan-verde-mantis.jpg",

            )
        )

        val list2 = mutableListOf<CarouselItem>()

        val carousel2: ImageCarousel = findViewById(R.id.carousel2)
        list2.add(
            CarouselItem(
                imageUrl = "https://www.coches.com/fotos_historicas/porsche/911-Carrera-S-Coupe-991-2015/high_porsche_911-carrera-s-coupe-991-2015_r5.jpg",
                )
        )

        list2.add(
            CarouselItem(
                imageUrl = "https://i.blogs.es/a5cf93/porsche-911-turbo-2014-prueba-motorpasion-9-1000/450_1000.jpg",
                )
        )

        val list3 = mutableListOf<CarouselItem>()

        val carousel3: ImageCarousel = findViewById(R.id.carousel3)
        list3.add(
            CarouselItem(
                imageUrl = "ford-mustang-gt-f-35-lightning-ii-edition-looks-ballistic-photo-gallery_2.jpg",
            )
        )

        list3.add(
            CarouselItem(
                imageUrl = "https://www.tuningblog.eu/wp-content/uploads/2018/09/cardiologie-Tuning-Ford-Mustang-GT-5.0-V8-3.jpg",
            )
        )
        val list4 = mutableListOf<CarouselItem>()

        val carousel4: ImageCarousel = findViewById(R.id.carousel5)
        list4.add(
            CarouselItem(
                imageUrl = "https://www.tuningblog.eu/wp-content/uploads/2018/09/cardiologie-Tuning-Ford-Mustang-GT-5.0-V8-3.jpg",
            )
        )

        list4.add(
            CarouselItem(
                imageUrl = "https://i.blogs.es/7303e6/seat-leon-st-cupra-black-carbon-08/1366_2000.jpg",
            )
        )

        carousel.addData(list)
        carousel1.addData(list1)
        carousel2.addData(list2)
        carousel3.addData(list3)
        carousel4.addData(list4)
    }


    private fun showMoreActionsMenu(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener (::manageItemClick)
        popupMenu.setOnDismissListener(::manageDismiss)
        popupMenu.show()
    }

    private fun manageItemClick(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.add_favorites -> {
                val dialog = AlertDialog.Builder(this,R.style.CustomDialogThemeferrari)
                    .setTitle(R.string.titulodialogo)
                    .setMessage(R.string.Mensajeferrari)
                    .setNegativeButton(R.string.botoncerrar) { view, _ ->
                        Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                        view.dismiss()
                    }

                    .setCancelable(false)
                    .create()

                dialog.show()
                true
            }
            R.id.share ->{
                true
            }
            else -> false
        }
    }

    private fun showMessage(title: CharSequence) {
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
    }
    private fun manageDismiss(popupMenu: PopupMenu) {
        showMessage("Menú cerrado")
    }



    private fun showMoreActionsMenu1(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener (::manageItemClick1)
        popupMenu.setOnDismissListener(::manageDismiss1)
        popupMenu.show()
    }

    private fun manageItemClick1(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.add_favorites -> {
                val dialog = AlertDialog.Builder(this,R.style.CustomDialogThemelam)
                    .setTitle(R.string.titulodialogo1)
                    .setMessage(R.string.Mensajelamborgini)
                    .setNegativeButton(R.string.botoncerrar) { view, _ ->
                        Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                        view.dismiss()
                    }

                    .setCancelable(false)
                    .create()

                dialog.show()
                true
            }
            R.id.share ->{
                true
            }
            else -> false
        }
    }


    private fun manageDismiss1(popupMenu: PopupMenu) {
        showMessage("Menú cerrado")
    }



    private fun showMoreActionsMenu2(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener (::manageItemClick2)
        popupMenu.setOnDismissListener(::manageDismiss2)
        popupMenu.show()
    }

    private fun manageItemClick2(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.add_favorites -> {
                val dialog = AlertDialog.Builder(this, R.style.CustomDialogThemeporche)
                    .setTitle(R.string.titulodialogo2)
                    .setMessage(R.string.Mensajemustang)
                    .setNegativeButton(R.string.botoncerrar) { view, _ ->
                        Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                        view.dismiss()
                    }

                    .setCancelable(false)
                    .create()

                dialog.show()
                true
            }
            R.id.share ->{
                true
            }
            else -> false
        }
    }


    private fun manageDismiss2(popupMenu: PopupMenu) {
        showMessage("Menú cerrado")
    }


    private fun showMoreActionsMenu3(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener (::manageItemClick3)
        popupMenu.setOnDismissListener(::manageDismiss3)
        popupMenu.show()
    }

    private fun manageItemClick3(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.add_favorites -> {
                val dialog = AlertDialog.Builder(this, R.style.CustomDialogThememustang)
                    .setTitle(R.string.titulodialogo3)
                    .setMessage(R.string.Mensajeporche)
                    .setNegativeButton(R.string.botoncerrar) { view, _ ->
                        Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                        view.dismiss()
                    }

                    .setCancelable(false)
                    .create()

                dialog.show()
                true
            }
            R.id.share ->{
                true
            }
            else -> false
        }
    }


    private fun manageDismiss3(popupMenu: PopupMenu) {
        showMessage("Menú cerrado")
    }

    private fun showMoreActionsMenu4(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener (::manageItemClick4)
        popupMenu.setOnDismissListener(::manageDismiss4)
        popupMenu.show()
    }

    private fun manageItemClick4(menuItem: MenuItem): Boolean {
        return when(menuItem.itemId){
            R.id.add_favorites -> {
                val dialog = AlertDialog.Builder(this,R.style.CustomDialogThemecupra)
                    .setTitle(R.string.titulodialogo4)
                    .setMessage(R.string.Mensajecupra)
                    .setNegativeButton(R.string.botoncerrar) { view, _ ->
                        Toast.makeText(this, "Cancel button pressed", Toast.LENGTH_SHORT).show()
                        view.dismiss()
                    }

                    .setCancelable(false)
                    .create()

                dialog.show()
                true
            }
            R.id.share ->{
                true
            }
            else -> false
        }
    }


    private fun manageDismiss4(popupMenu: PopupMenu) {
        showMessage("Menú cerrado")
    }


}