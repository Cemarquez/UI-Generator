require "gtk3"

builder = Gtk::Builder.new
builder.add_from_file("VentanaPrincipalViewPart.glade")
window = builder.get_object("VentanaPrincipal")
dataUsuarios = {}
modelUsuarios = Gtk::ListStore.new(String)

columnUsuarios = Gtk::TreeViewColumn.new("Usuarios", Gtk::CellRendererText.new, {:text => 0})
treeviewUsuarios = builder.get_object("treeviewUsuarios")
treeviewUsuarios.set_model(modelUsuarios)
treeviewUsuarios.append_column(columnUsuarios)
treeviewUsuarios.selection.set_mode(:single)
window.show_all
Gtk.main
