/********** DOM ELEMENTS **********/
const matricula = new Matricula();

const btnAbreDatosPersonales = document.getElementById('btnAbreDatosPersonales');
const listaProfes = document.getElementById('listaProfes');
const contenedor = document.getElementById('contenedor');
const capamatricula = document.getElementById('capamatricula');
const btnEfectuarMatricula = document.getElementById('btnEfectuarMatricula');
const formDatos = document.getElementById('formDatos');
const dni = document.getElementById('dni');
const nombre = document.getElementById('nombre');
const btnCierraDatosPersonales = document.getElementById('btnCierraDatosPersonales');

const createProfessorList = () => {
    let profesorList = new Set();
    profesorList.add('Todos');
    modulos.forEach(a => profesorList.add(a.profesor));

    let content = "";
    profesorList.forEach(a => {
        content += `<option value="${a}">${a}</option>`
    })

    return content
}

const paintProfesorList = () => {
    listaProfes.innerHTML = createProfessorList();
}


const createModule = (m) => {
    return `<div class="col">
                <div class="card">
                    <img src="assets/${m.nombre.toLowerCase()}.png" class="card-img-top"/>
                    <div class="card-body">
                        <h5 class="card-title">${m.nombre}</h5>
                    </div>
                    <button id=${m.codigo} class="btn-success matricular">Matricular</button>
                </div>
            </div>`
}

const paintModules = (profesor) => {

    let modulesFiltered = modulos.slice();

    if (profesor != 'Todos') {
        modulesFiltered = modulos.filter(a => a.profesor == profesor);
    }

    let content = "";
    modulesFiltered.forEach(a => content += createModule(a))
    contenedor.innerHTML = content;

    const buttons = document.querySelectorAll(".matricular");
    buttons.forEach(btn => {
        btn.addEventListener("click", (event) => {
            matricula.addModule(event.target.id);
            paintModules();
        })
    })
}


const createMatricula = () => {
    let content = "<table class='table table-bordered table-striped'>";
    matricula.modules.forEach(a => {
        content += `<tr>
                        <td>${a.nombre}</td>
                        <td>${a.creditos}</td>
                        <td><button id=${a.codigo} class='btn btn-danger removeMatricula'>Borrar</button></td>
                    </tr>`
    })
    return content;
}

const paintMatricula = () => {
    capamatricula.innerHTML = createMatricula();

    const buttons = document.querySelectorAll(".removeMatricula");
    buttons.forEach(btn => {
        btn.addEventListener("click", (event) => {
            matricula.removeModule(event.target.id);
            paintMatricula();
        })
    })
}

const finishMatricula = () => {
    if (matricula.dni == null) {
        console.log('No puedes matricularte sin dni')
        return;
    }

    if (matricula.name == null) {
        console.log('No puedees matricularte sin nombre')
        return;
    }

    console.log(matricula)

    // reset
    matricula.dni = null;
    matricula.name = null;
    matricula.modules = [];
    capamatricula.innerHTML = "";
}


/********** LSITENERS **********/
paintProfesorList();
paintModules('Todos');

listaProfes.addEventListener("change", (event) => {
    paintModules(event.target.value);
})

btnAbreDatosPersonales.addEventListener("click", () => {
    formDatos.showModal();
})

btnCierraDatosPersonales.addEventListener("click", () => {
    matricula.updatePersonalData(dni.value, nombre.value);
    formDatos.close();
})

btnEfectuarMatricula.addEventListener("click", () => {
    finishMatricula();
})

