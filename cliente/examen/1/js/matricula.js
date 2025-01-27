class Matricula {

    dni;
    name;
    modules;

    constructor() {
        this.dni = null;
        this.name = null;
        this.modules = [];
    }

    addModule(codigo) {
        const modulo = this.modules.find(a => a.codigo == codigo)
        if (!modulo) {
            console.log('Module not found');
            return;
        }

        if (!this.modules.find(a => a.codigo == codigo)) {
            this.modules.push(modulo)
        }
    }

    removeModule(codigo) {
        const modulo = this.modules.findIndex(a => a.codigo == codigo)
        if (modulo > -1) {
            this.modules.splice(index, 1);
        }
    }

    updatePersonalData(dni, name) {
        // verifica si dni y name están vacíos después de quitar los espacios en blanco
        if (dni.trim() == "" || name.trim() == "") {
            console.log("Datos personales no válidos");
            return;
        }
        this.dni = dni;
        this.name = name;
    }
}