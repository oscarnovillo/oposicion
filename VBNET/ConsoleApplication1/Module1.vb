Module Module1

    Sub Main()

        Dim menu As Menu
        menu = New Menu()
        menu.Options.Add(New MenuOption("programa1", "1"))
        menu.Options.Add(New MenuOption("programa2", "2"))
        menu.Options.Add(New MenuOption("programa3", "3"))
        menu.Options.Add(New MenuOption("programa4", "4"))
        menu.Options.Add(New MenuOption("programa5", "5"))
        menu.Options.Add(New MenuOption("programa6", "6"))
        menu.Options.Add(New MenuOption("programa7", "7"))
        menu.Options.Add(New MenuOption("programa8", "8"))
        menu.Options.Add(New MenuOption("programa9", "9"))
        menu.Options.Add(New MenuOption("programa10", "10"))

        Dim op As String = menu.Show()
        Select Case op
            Case "1"
                ejemplo1()
            Case "2"
                ejemplo2()
            Case "3"
                ejemplo3()
            Case "4"
                ejemplo4()
            Case "5"
                ejemplo5()
            Case "6"
                ejemplo6()
            Case "7"
                ejemplo7()
            Case "8"
                ejemplo8()
            Case "9"
                ejemplo9()
            Case "10"
                ejemplo10()
            Case Else
                Console.WriteLine("ADIOS")
        End Select


    End Sub


    Sub ejemplo1()
        Dim vector() As Integer
        Dim longitud As Integer
        Dim a As ArrayList

        a = New ArrayList
        Dim i As Integer = 0, j As Integer
        Dim salir As Boolean
        Try
            Console.WriteLine("Introduzca el número de elementos")
            longitud = Console.ReadLine()
        Catch e As Exception
            Console.WriteLine("El error ocurrido{1} es : {0}", e.ToString, "pp")
        End Try
        longitud -= 1

        ReDim vector(longitud)
        For i = 0 To longitud Step 1
            Do
                Try
                    Console.WriteLine("Introduzca el elemento {0}", i + 1)
                    Dim num As Integer
                    num = CType(Console.ReadLine(), Integer)
                    vector(i) = num
                    a.Add(num)

                    salir = True
                Catch e As InvalidCastException
                    salir = False
                    Console.WriteLine("El valor introducido no es un entero")
                Catch e As Exception
                    salir = False
                    Console.WriteLine(e.ToString)
                End Try
            Loop Until salir
        Next
        j = 1
        For Each num As Integer In a
            Console.WriteLine("{0}", num)
        Next

        For i = 0 To vector.Length - 1
            Console.Write("{0}{1}", vector(i).ToString, vbTab)
            If j = 3 Then
                Console.WriteLine()
                j = 0
            End If
            j += 1
        Next
        Console.ReadLine()
    End Sub

    Sub ejemplo2()
        Dim matriz() As Integer, numero As Integer = 1
        Dim acumulado As Integer, elementos As Integer = -1
        Do
            elementos += 1
            Console.WriteLine("Introduzca un número")
            numero = CType(Console.ReadLine(), Integer)
            acumulado += numero
            ReDim Preserve matriz(elementos)
            matriz(elementos) = numero
        Loop Until numero = 0
        Console.WriteLine("La media es {0}", acumulado / elementos)
        Console.WriteLine("La suma de los elementos es {0}", acumulado)
        Console.ReadLine()
    End Sub


    Sub ejemplo3()
        Dim mtr1(), mtr2(), mtr_res(), numero As Single

        Dim i As Integer = -1
        Console.WriteLine("Intoduciendo los valores del primer vector")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve mtr1(i)
                mtr1(i) = numero
            End If
        Loop Until numero = 0
        i = -1
        Console.WriteLine("Intoduciendo los valores del segundo vector")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve mtr2(i)
                mtr2(i) = numero
            End If
        Loop Until numero = 0
        ReDim mtr_res(mtr1.Length + mtr2.Length - 1)
        For i = 0 To mtr1.Length - 1
            mtr_res(i) = mtr1(i)
        Next
        For i = 0 To mtr2.Length - 1
            mtr_res(i + mtr1.Length) = mtr2(i)
        Next
        Console.WriteLine("{0}Listado de la matriz resultante", vbCrLf)
        For i = 0 To mtr_res.Length - 1
            Console.Write("{0} {1}", mtr_res(i), vbTab)


            If i Mod 3 = 0 Then
                Console.WriteLine()
            End If
        Next
        Console.ReadLine()
    End Sub

    Enum c
        radio = 0
        perimetro = 1
        area = 2
    End Enum

    Sub ejemplo4()
        Dim fila As c
        Dim radios(), tabla(,), numero As Single
        Dim i As Integer = -1

        Console.WriteLine("Intoduciendo los valores de los radios")
        Do
            Console.Write("Introduzca valor {0}:", i + 1)
            numero = CType(Console.ReadLine(), Single)
            If numero <> 0 Then
                i += 1
                ReDim Preserve radios(i)
                radios(i) = numero
            End If
        Loop Until numero = 0
        ReDim tabla(2, radios.Length - 1)
        For i = 0 To radios.Length - 1
            tabla(c.radio, i) = radios(i)
            tabla(c.perimetro, i) = 2 * tabla(c.radio, i) * Math.PI
            tabla(c.area, i) = tabla(c.radio, i) ^ 2 * Math.PI
        Next
        Console.WriteLine("{0}Radio{1}Perimetro{2}Area", vbCrLf, vbTab, vbTab)
        For i = 0 To radios.Length - 1
            Console.WriteLine("{0}{1}{2}{3}{4}", tabla(c.radio, i), vbTab,
            tabla(c.perimetro, i), vbTab, tabla(c.area, i))
        Next
        Console.WriteLine("{0}{1}Pulse INTRO para finalizar", vbCrLf, vbCrLf)
        Console.ReadLine()
    End Sub


    Sub ejemplo5()

        Dim num1, num2, num3, c As Integer
        Dim menor As Integer = 100
        Console.WriteLine("Introduzca tres numero para saber cual es el menor: ")
        Console.Write("Numero 1:")
        num1 = Console.ReadLine()
        Console.Write("Numero 2:")
        num2 = Console.ReadLine()
        Console.Write("Numero 3:")
        num3 = Console.ReadLine()
        If num1 < num2 Then
            If num1 < num3 Then
                Console.WriteLine("El mas pequeño: {0}", num1)
            Else
                Console.WriteLine("El mas pequeño: {0}", num3)
            End If
        Else
            If num2 < num3 Then
                Console.WriteLine("El mas pequeño: {0}", num2)
            Else
                Console.WriteLine("El mas pequeño: {0}", num3)
            End If
        End If
        Console.ReadLine()
    End Sub

    Sub ejemplo6()
        Dim Mes, Año As Integer
        Console.Write("Introduzca el mes: ")
        Mes = Console.ReadLine
        Console.Write("Introduzca el año: ")
        Año = Console.ReadLine
        Select Case Mes
            Case 1, 3, 5, 7, 8, 10, 12
                Console.Write("El mes tiene 31 Dias")
            Case 4, 6, 9, 11
                Console.Write("El mes tiene 30 dias")
            Case 2
                If (Año Mod 4 <> 0) And ((Año Mod 100 <> 0) Or (Año Mod 400 = 0)) Then
                    Console.Write("El mes tienes 28 dias")
                Else
                    Console.Write("El mes tiene 29 dias")
                End If
            Case Else
                Console.Write("Has introducido un mes incorrecto")
        End Select
        Console.Read()
    End Sub

    Sub ejemplo7()
        Dim x = 1, y = 1, z As Integer = 0
        Dim Th As Char = Convert.ToChar(&H9)
        Console.WriteLine("Z" & Th & "X" & Th & "Y")
        Console.WriteLine("________________")
        While (x <= 50)
            z = Math.Sqrt(x ^ 2 + y ^ 2)
            While y <= 50 AndAlso z <= 50
                If z ^ 2 = x ^ 2 + y ^ 2 Then
                    Console.WriteLine(x & Th & y & Th & z)
                End If
                y += 1
                z = Math.Sqrt(x ^ 2 + y ^ 2)
            End While
            x += 1
            y = x
        End While
        Console.ReadLine()

    End Sub
    Function MultiplicarSumando(ByVal nValor1 As Integer,
                                ByVal nValor2 As Integer) As Integer
        Dim nContador, nTotal As Integer
        nTotal = 0
        For nContador = 1 To nValor2 Step 1
            nTotal += nValor1
        Next
        Return nTotal
    End Function

    Sub ejemplo8()
        Dim nValor1, nValor2 As Integer
        Console.Write("Introduzca el primer valor: ")
        nValor1 = Console.ReadLine()
        Console.Write("Introduzca el segundo valor: ")
        nValor2 = Console.ReadLine()
        Console.WriteLine(nValor1 & " x " & nValor2 & " = " &
             MultiplicarSumando(nValor1, nValor2))
    End Sub

    Function Sumar(ByVal nOp1 As Integer, ByVal nOp2 As Integer)
        Return nOp1 + nOp2
    End Function
    Function Restar(ByVal nOp1 As Integer, ByVal nOp2 As Integer)
        Return nOp1 - nOp2
    End Function
    Function Multiplicar(ByVal nOp1 As Integer, ByVal nOp2 As Integer)
        Return nOp1 * nOp2
    End Function
    Function Dividir(ByVal nOp1 As Integer, ByVal nOp2 As Integer)
        Dim resultado As Integer = 0
        If nOp2 <> 0 Then
            resultado = nOp1 / nOp2
        End If
        Return resultado
    End Function
    Sub ejemplo9()
        Dim nOpcion, nOp1, nOp2 As Integer
        Do
            Console.WriteLine("1. Suma")
            Console.WriteLine("2. Resta")
            Console.WriteLine("3. Multiplicacion")
            Console.WriteLine("4. Division")
            Console.WriteLine("0. Salir")
            Console.Write("Seleccionar una opcion: ")
            nOpcion = Console.ReadLine()
            If nOpcion <> 0 Then
                Console.Write("Introduzca el primer operando: ")
                nOp1 = Console.ReadLine()
                Console.Write("Introduzca el segundo operando: ")
                nOp2 = Console.ReadLine()
            End If
            Select Case nOpcion
                Case 0
                    Console.WriteLine("FIN DE PROGRAMA")
                Case 1
                    Console.WriteLine(nOp1 & " + " & nOp2 & " = " &
                                      Sumar(nOp1, nOp2))
                Case 2
                    Console.WriteLine(nOp1 & " - " & nOp2 & " = " &
                                      Restar(nOp1, nOp2))
                Case 3
                    Console.WriteLine(nOp1 & " * " & nOp2 & " = " &
                                      Multiplicar(nOp1, nOp2))
                Case 4
                    Console.WriteLine(nOp1 & " / " & nOp2 & " = " &
                                      Dividir(nOp1, nOp2))
            End Select
        Loop Until nOpcion = 0

    End Sub

    Sub CambiaValores(ByRef nValor1 As Integer, ByRef nValor2 As Integer)
        Dim nAux As Integer
        nAux = nValor1 + nValor2
        nValor2 = nValor1 - nValor2
        nValor1 = nAux
    End Sub
    Sub ejemplo10()
        Dim nValor1, nValor2 As Integer
        Console.Write("Introduzca un valor: ")
        nValor1 = Console.ReadLine()
        Console.Write("Introduzca un valor: ")
        nValor2 = Console.ReadLine()
        CambiaValores(nValor1, nValor2)
        Console.WriteLine("nValor1 = " & nValor1)
        Console.WriteLine("nValor2 = " & nValor2)
    End Sub
    Sub CopiarTablas(ByVal tb1() As Integer, ByRef tb2() As Integer,
                     ByRef tb3() As Integer)
        Dim nIndice, nIndice2, nIndice3 As Integer
        nIndice2 = 0 : nIndice3 = 0
        For nIndice = 0 To tb1.Length - 1
            If tb1(nIndice) Mod 2 = 0 Then
                ReDim Preserve tb2(nIndice2)
                tb2(nIndice2) = tb1(nIndice)
                nIndice2 += 1
            Else
                ReDim Preserve tb3(nIndice3)
                tb3(nIndice3) = tb1(nIndice)
                nIndice3 += 1
            End If
        Next
    End Sub
    Sub ejemplo11()
        Dim tb1(9), tb2(), tb3(), nIndice As Integer
        For nIndice = 0 To tb1.Length - 1
            Console.Write("tb1(" & nIndice & "): ")
            tb1(nIndice) = Console.ReadLine()
        Next
        CopiarTablas(tb1, tb2, tb3)
        Console.WriteLine("PARES")
        For nIndice = 0 To tb2.Length - 1
            Console.WriteLine(tb2(nIndice))
        Next
        Console.WriteLine("IMPARES")
        For nIndice = 0 To tb3.Length - 1
            Console.WriteLine(tb3(nIndice))
        Next
    End Sub


    Sub ejemplo12()
        Dim Dia, Mes, Año, Tarot, fallo As Integer
        fallo = 0
        Console.Write("Introduce tu dia de nacimiento: ")
        Dia = Console.ReadLine
        Console.Write("Introduce el mes de tu nacimiento: ")
        Mes = Console.ReadLine
        Console.Write("Introduce el año de tu nacimiento: ")
        Año = Console.ReadLine
        Select Case Mes
            Case 1, 3, 5, 7, 8, 10, 12
                If Dia > 31 Then
                    fallo = 1
                End If
            Case 4, 6, 9, 11
                If Dia > 30 Then
                    fallo = 1
                End If
            Case 2
                If ((Año Mod 4 <> 0) Or ((Año Mod 100 = 0) And (Año Mod 400 <> 0))) Then
                    If Dia > 28 Then
                        fallo = 1
                    End If
                Else
                    If Dia > 29 Then
                        fallo = 1
                    End If
                End If
            Case Else
                fallo = 2
        End Select
        If Dia < 1 Then
            fallo = 1
        End If
        If fallo = 0 Then
            Tarot = Dia + Año + Mes
            Año = Tarot / 1000
            Mes = Tarot / 100 - (Año * 10)
            Dia = Tarot / 10 - (Año * 100 + Mes * 10)
            Tarot = Tarot - (Año * 1000 + Mes * 100 + Dia * 10)
            Tarot = Tarot + Dia + Mes + Año
            While Tarot > 9
                Año = Tarot / 10
                Tarot = Tarot - (Año * 10)
            End While
            Console.Write("Tu numero del tarot es el " & Tarot)
        ElseIf fallo = 1 Then
            Console.Write("Ha introducido un dia erroneo")
        ElseIf fallo = 2 Then
            Console.Write("Ha introducido un mes erroneo")
        End If
        Console.Read()
    End Sub
    Sub ejemplo13()
        Dim Alumno As String, not1, not2, not3, resultado As Integer
        Console.WriteLine("Introduzca el nombre del alumno:")
        Alumno = Console.ReadLine()
        Console.WriteLine("Nota de la primera evaluación")
        not1 = Console.ReadLine()
        Console.WriteLine("Nota de la segunda evaluación")
        not2 = Console.ReadLine()
        Console.WriteLine("Nota de la tercera evaluación")
        not3 = Console.ReadLine()
        Console.WriteLine("Alumno:{0},Notas:{1},{2},{3}", Alumno, not1, not2, not3)
        If not1 = 0 Or not2 = 0 Or not3 = 0 Then
            Console.WriteLine("El alumno no se ha presentado a alguna de las evaluaciones")
        Else
            resultado = (not1 + not2 + not3) / 3
            Select Case resultado
                Case Is > 9
                    Console.WriteLine("{0} ha obtenido Sobresaliente como nota final", Alumno)
                Case Is > 7
                    Console.WriteLine("{0} ha obtenido Notable como nota final", Alumno)
                Case Is > 5
                    Console.WriteLine("{0} ha obtenido Aprobado como nota final", Alumno)
                Case Is > 4
                    Console.WriteLine("{0} ha obtenido Insusficiente como nota final", Alumno)
                Case Else
                    Console.WriteLine("{0} ha obtenido Muy deficiente como nota final", Alumno)
            End Select
        End If
        Console.Read()

    End Sub

    Const max As Integer = 20000
    Dim vector(max) As Integer

    Private Sub rellenar(ByRef vec() As Integer)
        Dim i As Integer
        vec(0) = 0
        For i = 1 To max
            vec(i) = max + 1 - i
        Next
    End Sub
    Private Sub seleccion()
        Dim i, j, k As Integer
        Dim inicio, fin, tiempo As Long
        Dim diff As TimeSpan
        inicio = Now.Ticks
        For i = 1 To vector.Length - 2
            k = i
            vector(0) = vector(i)
            For j = i + 1 To vector.Length - 1
                If vector(j) < vector(0) Then
                    k = j
                    vector(0) = vector(k)
                End If
            Next
            vector(k) = vector(i)
            vector(i) = vector(0)
        Next
        fin = Now.Ticks
        tiempo = fin - inicio
        Console.WriteLine("El tiempo con seleccion es transcurrido es {0}", tiempo / diff.TicksPerSecond)
    End Sub

    Sub Insercion()
        Dim i, j As Integer
        Dim inicio, fin, tiempo As Long
        Dim diff As TimeSpan
        inicio = Now.Ticks
        For i = 2 To vector.Length - 1
            vector(0) = vector(i)
            j = i
            Do While (vector(0) < vector(j - 1)) 'AndAlso j > 0
                vector(j) = vector(j - 1)
                j = j - 1
            Loop
            vector(j) = vector(0)
        Next
        fin = Now.Ticks
        tiempo = fin - inicio
        Console.WriteLine("El tiempo con insercion es transcurrido es {0}", tiempo / diff.TicksPerSecond)
    End Sub

    Private Sub burbuja()
        Dim i, j As Integer
        Dim inicio, fin, tiempo As Long
        Dim diff As TimeSpan
        inicio = Now.Ticks
        For i = 1 To vector.Length - 2
            For j = 1 To vector.Length - (i + 1)
                If vector(j) > vector(j + 1) Then
                    vector(0) = vector(j + 1)
                    vector(j + 1) = vector(j)
                    vector(j) = vector(0)
                End If
            Next
        Next
        fin = Now.Ticks
        tiempo = fin - inicio
        Console.WriteLine("El tiempo con burbuja es transcurrido es {0}", tiempo / diff.TicksPerSecond)
    End Sub
    Sub ejemplo14()
        rellenar(vector)
        seleccion()
        rellenar(vector)
        Insercion()
        rellenar(vector)
        burbuja()
        Console.Read()

    End Sub
    Sub ejemplo15()

    End Sub
    Sub ejemplo16()

    End Sub
End Module



