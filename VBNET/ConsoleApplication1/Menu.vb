Public Class Menu

    Public Property BackColor As ConsoleColor = ConsoleColor.Black
    Public Property CenterTitle As Boolean = True
    Public Property ForeColor As ConsoleColor = ConsoleColor.Green
    Public Property Options As List(Of MenuOption) = New List(Of MenuOption)
    Public Property Spacing As Integer = 3
    Public Property Title As String = "Menu"

    Public Function Show() As String
        'Clear the console
        Console.Clear()

        'Set the color
        Console.BackgroundColor = Me.BackColor
        Console.ForegroundColor = Me.ForeColor

        'Print the title
        Console.CursorTop = 0 : Console.CursorLeft = If(Me.CenterTitle, (Console.BufferWidth \ 2) - (Me.Title.Length \ 2), 0)
        Console.Write(Me.Title)

        'Print the options
        Console.CursorLeft = 0 : Console.CursorTop = 2
        Dim left As Integer = Me.Options.Max(Function(m) m.Name.Length) + Me.Spacing
        For i As Integer = 0 To Me.Options.Count - 1
            Dim item As MenuOption = Me.Options.Item(i)
            Console.Write((i + 1).ToString & ") " & item.Name)
            Console.CursorLeft = left + (i + 1).ToString.Length + 1
            Console.WriteLine(item.Description)
        Next

        'Finish
        Return Console.ReadLine()
    End Function

End Class

Public Class MenuOption

    Public Sub New(description As String, name As String)
        Me.Description = description
        Me.Name = name
    End Sub

    Public Property Description As String
    Public Property Name As String

End Class
